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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaView;

import javax.xml.bind.JAXB;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;


public class Controller implements Initializable, EventHandler<MouseEvent> {

    @FXML
    public VBox vbox1;

    @FXML
    public GridPane pelisGrid;

    @FXML
    public Label titoltop, titol, situacio, any, titolOriginal, direccio, interprets, versio, idioma, descripcio;
    public TableColumn titolColumn, dataColumn, localitatColumn, comarcaColumn;

    @FXML
    public HBox hBoxCicles;
    @FXML
    TabPane paneTab;

    @FXML
    public HBox hBoxNpaginas;

    @FXML
    ImageView peliculasImageView;

    @FXML
    MediaView peliculasMediaView;

    @FXML
    ListView<String> cinemesListView;
    @FXML
    TableView<SessionsColumns> sessionsTable;

    private ObservableList<String> sessions = FXCollections.observableArrayList();
    private ObservableList<String> cinemes = FXCollections.observableArrayList();

    @FXML
    private void handleButton1Click(ActionEvent actionEvent){
        System.out.println("Hola " + ((Button) actionEvent.getSource()).getId());
    }

    Pelicules pelicules = JAXB.unmarshal("http://gencat.cat/llengua/cinema/provacin.xml", Pelicules.class);
    Cinemes cines = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cinemes.xml", Cinemes.class);
    Sessions session = JAXB.unmarshal("http://gencat.cat/llengua/cinema/film_sessions.xml", Sessions.class);
    Cicles ciclos = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cicles.xml", Cicles.class);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Hello world!");
        paneTab.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Tab>() {
                    @Override
                    public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
                        System.out.println("http://gencat.cat/llengua/cinema/"+ pelicules.getFILM().get(2).getCARTELL());
                    }
                }
        );
//    public TableColumn titolColumn, dataColumn, localitatColumn, comarcaColumn;
        cargarPestanyaPelicula(2);
        generatePeliculas(0, pelicules);
        cargarCinemes(pelicules.getFILM().get(2).getIDFILM());
        cargarCicles(pelicules.getFILM().get(2).getIDFILM());
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

        if (hBoxCicles.getChildren().size()<=1) hBoxCicles.getChildren().add(new Label("Aquesta pelicula no hi es relacionada amb cap cicle."));
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
                    System.out.println(sessio.getTITOL());
                    sessionsTable.getItems().addAll(new SessionsColumns(sessio.getTITOL(), sessio.getSesData(), sessio.getLOCALITAT(), sessio.getLOCALITAT()));
                });
    }


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

    @Override
    public void handle(MouseEvent mouseEvent) {
    }
}
