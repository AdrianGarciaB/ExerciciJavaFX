package com.pratikadrian.controler;

import com.pratikadrian.model.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;

import javax.xml.bind.JAXB;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;


public class Controller implements Initializable {
    @FXML public VBox vbox1;
    @FXML public GridPane pelisGrid;
    @FXML public Label titoltop, titol, situacio, any, titolOriginal, direccio, interprets, versio, idioma, descripcio;
    @FXML public HBox hBoxCicles;
    @FXML public WebView trailerWebView;
    @FXML TabPane paneTab;
    @FXML public HBox hBoxNpaginas;
    @FXML ImageView peliculasImageView;
    @FXML MediaView peliculasMediaView;
    @FXML ListView<String> cinemesListView;
    @FXML TableView<SessionsColumns> sessionsTable;
    @FXML PieChart pieChart01;
    @FXML PieChart pieChart00;
    @FXML private TableColumn titolColumn, dataColumn, localitatColumn, comarcaColumn;
    private ObservableList<PieChart.Data> dataCharts;
    private List<Integer> dadesInts = new ArrayList<>();
    private ObservableList<PieChart.Data> dataCharts0;
    private List<Integer> dadesInts0 = new ArrayList<>();
    private ObservableList<String> sessions = FXCollections.observableArrayList();
    private ObservableList<String> cinemes = FXCollections.observableArrayList();
    private Pelicules pelicules = JAXB.unmarshal("http://gencat.cat/llengua/cinema/provacin.xml", Pelicules.class);
    private Cinemes cines = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cinemes.xml", Cinemes.class);
    private Sessions session = JAXB.unmarshal("http://gencat.cat/llengua/cinema/film_sessions.xml", Sessions.class);
    private Cicles ciclos = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cicles.xml", Cicles.class);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /* Cargamos las estadisticas de los cines */
        cargarCinesPorProvincia();
        cargarCinesPorLocalidad();

        /*
        Cargamos una pelicula por defecto en la pestaña de pelicula en caso de
        que no se selecionara previamente.
         */
        cargarPestanyaPelicula(2);
        generatePeliculas(0, pelicules);
        cargarCinemes(pelicules.getFILM().get(2).getIDFILM());
        cargarCicles(pelicules.getFILM().get(2).getIDFILM());
        trailerWebView.setMaxHeight(350);
        trailerWebView.getEngine().load("http://youtube.com/embed/" + pelicules.getFILM().get(2).getTRAILER());
    }

    private void cargarCinesPorProvincia(){
        dataCharts = FXCollections.observableArrayList();
        Map<String, Long> provinceCount = cines.getCINEMES().stream()
                .filter(cinema -> !cinema.getCOMARCA().equals("--"))
                .collect(Collectors.groupingBy(Cinema::getPROVINCIA, Collectors.counting()));

        provinceCount.forEach((provincia,valor) -> {
            dataCharts.add(new PieChart.Data(provincia,valor));
        });
        pieChart01.setData(dataCharts);
        pieChart01.setTitle("Provincias con mas cines.");
    }

    private void cargarCinesPorLocalidad(){
        dataCharts0 = FXCollections.observableArrayList();
        Map<String, Long> cinemes =
                cines.getCINEMES().stream()
                        .collect(Collectors.groupingBy(Cinema::getCOMARCA, Collectors.counting()));

        cinemes.forEach((localitat,valor) -> {
            dataCharts0.add(new PieChart.Data(localitat ,valor));
        });
        pieChart00.setData(dataCharts0);
        pieChart00.setTitle("Localidades con mas cines.");
    }

    private void cargarCicles(String idPelicula){
        hBoxCicles.getChildren().clear();
        // Uso de hashset para eliminar los ciclos duplicados en las mismas sessiones.
        HashSet<String> sessionInfo = new HashSet<>();
        session.getSESSIONS().stream()
                .filter(sessio -> sessio.getIDFILM().equals(idPelicula))
                .forEach(sessio -> {
                    sessionInfo.add(sessio.getCICLEID());
                });
        sessionInfo.forEach(s -> {
            ciclos.getCICLE().stream()
                    .filter(cicle -> cicle.getCICLEID().equals(s))
                    .forEach(cicle -> {
                        ImageView tmp = new ImageView("http://gencat.cat/llengua/cinema/"+ cicle.getIMGCICLE());
                        tmp.setFitWidth(1280/9);
                        tmp.setFitHeight(150);
                        hBoxCicles.getChildren().add(tmp);
                    });
        });

        if (hBoxCicles.getChildren().size()<1) hBoxCicles.getChildren().add(new Label("Aquesta pelicula no hi es relacionada amb cap cicle."));
    }

    private void cargarCinemes(final String idPelicula) {
        cinemesListView.getItems().clear();
        sessionsTable.getItems().clear();
        HashSet<String> cinesList = new HashSet<>();
        session.getSESSIONS().stream()
                .filter(sessio -> sessio.getIDFILM().equals(idPelicula))
                .forEach(sessio -> cinesList.add(sessio.getCINENOM()));
        cinemes.addAll(cinesList);

        cinemesListView.setItems(cinemes);
        cargarSessions(cinemesListView.getItems().get(0), idPelicula);

        cinemesListView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                cargarSessions(cinemesListView.getSelectionModel().getSelectedItem(), idPelicula);
            }
        });
    }

    private void cargarSessions(String nomCine, String idPelicula){
        sessionsTable.getItems().clear();
        titolColumn.setCellValueFactory(new PropertyValueFactory<>("titol"));
        dataColumn.setCellValueFactory(new PropertyValueFactory<>("data"));
        localitatColumn.setCellValueFactory(new PropertyValueFactory<>("localitat"));
        comarcaColumn.setCellValueFactory(new PropertyValueFactory<>("comarca"));
        session.getSESSIONS().stream()
                .filter(sessio -> sessio.getCINENOM().equals(nomCine))
                .filter(sessio -> sessio.getIDFILM().equals(idPelicula))
                .forEach(sessio -> {
                    // Cuando hacemos click en la pelicula cargamos los datos de esta.
                    System.out.println(sessio.getTITOL());
                    sessionsTable.getItems().addAll(new SessionsColumns(sessio.getTITOL(), sessio.getSesData(), sessio.getLOCALITAT(), sessio.getLOCALITAT()));
                    trailerWebView.getEngine().load("http://youtube.com/embed/" + sessio.getIDFILM().equals(idPelicula));
                });
    }

    // Generamos el indice para poder navegar entre las listas de pelicula.
    public void generatePages(int actual, int max){
        hBoxNpaginas.getChildren().clear();
        for (int i = 1; i <= actual+10 && i < max+1; i++) {
            Button button = new Button();
            button.setText(String.valueOf(i));
            int finalI = i;
            button.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    System.out.println(actual);
                    generatePeliculas(finalI-1, pelicules);
                }
            });
            if (i == actual+1) button.setStyle("-fx-font-weight: bold;");
            hBoxNpaginas.getChildren().add(button);
        }


    }

    public void generatePeliculas(int actual, Pelicules pelicules){
        // Por defecto para la pestaña peliculas

        pelisGrid.getChildren().clear();
        generatePages(actual, pelicules.getFILM().size()/(3*6)+1);
        int count = actual * (3*6);
        for (int i = actual; i < actual+3; i++) {
            for (int j = 0; j < 6; j++) {
                count++;
                ImageView tmp = new ImageView("http://gencat.cat/llengua/cinema/"+ pelicules.getFILM().get(count).getCARTELL());
                tmp.setFitWidth(1280/6);
                tmp.setFitHeight(300);
                int finalCount = count;
                tmp.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        peliculasImageView.setImage(new Image("http://gencat.cat/llengua/cinema/"+ pelicules.getFILM().get(finalCount).getCARTELL()));
                        paneTab.getSelectionModel().select(1);
                        cargarPestanyaPelicula(finalCount);
                        cargarCinemes(pelicules.getFILM().get(finalCount).getIDFILM());
                        cargarCicles(pelicules.getFILM().get(finalCount).getIDFILM());

                    }
                });
                pelisGrid.add(tmp, j, i);
            }
        }
    }

    // Cargamos datos de la pelicula que deseamos.
    public void cargarPestanyaPelicula(int idPelicula){
        Pelicula pelicula = pelicules.getFILM().get(idPelicula);
        peliculasImageView.setImage(new Image("http://gencat.cat/llengua/cinema/"+ pelicula.getCARTELL()));

        titoltop.setText(pelicula.getTITOL());
        titol.setText("Titol: " + pelicula.getTITOL());
        situacio.setText("Situacio: " + pelicula.getSITUACIO());
        any.setText("Any: " + pelicula.getANY());
        titolOriginal.setText("Titol Original: " + pelicula.getORIGINAL());
        direccio.setText("Direccio: " + pelicula.getDIRECCIO());
        interprets.setText("Interprets: " + pelicula.getINTERPRETS());
        versio.setText("Versio: " + pelicula.getVERSIO());
        idioma.setText("Idioma Original: " + pelicula.getIDIOMAX0020ORIGINAL());
        descripcio.setText("Descripcio: " +pelicula.getSINOPSI());
    }
}
