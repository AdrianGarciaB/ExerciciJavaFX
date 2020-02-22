package com.pratikadrian.controler;

import com.pratikadrian.model.Pelicules;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.xml.bind.JAXB;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable, EventHandler<MouseEvent> {


    @FXML
    public VBox vbox1;

    @FXML
    public GridPane pelisGrid;

    @FXML
    public HBox hBoxNpaginas;

    @FXML
    private void handleButton1Click(ActionEvent actionEvent){
        System.out.println("Hola " + ((Button) actionEvent.getSource()).getId());
    }

    Pelicules pelicules = JAXB.unmarshal("http://gencat.cat/llengua/cinema/provacin.xml", Pelicules.class);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Hello world!");

        generatePeliculas(0, pelicules);

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
                    }
                });
                pelisGrid.add(tmp, j, i);
            }
        }
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
    }
}
