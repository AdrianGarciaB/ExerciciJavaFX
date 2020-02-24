package com.pratikadrian;

import com.pratikadrian.controler.Controller;
import com.pratikadrian.model.Cicles;
import com.pratikadrian.model.Cinemes;
import com.pratikadrian.model.Pelicules;
import com.pratikadrian.model.Sessions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

public class Main extends Application  {
    public static void main(String[] args) throws JAXBException {
        launch(args);
        Pelicules pelicules = JAXB.unmarshal("http://gencat.cat/llengua/cinema/provacin.xml", Pelicules.class);
        Cicles ciclos = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cicles.xml", Cicles.class);
        Cinemes cines = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cinemes.xml", Cinemes.class);
        Sessions session = JAXB.unmarshal("http://gencat.cat/llengua/cinema/film_sessions.xml", Sessions.class);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(
                "fxml/Main.fxml"));
        Parent root = (Parent) loader.load();
        //PersonEditorCtrl ctrl = loader.getController();



        // el scene contiene al ROOT NODE
        Scene scene = new Scene(root, 1280, 1026);

        // configurar y mostrar el stage
        primaryStage.setTitle("Hola JavaFX 8");
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller controller = (Controller) loader.getController();
        /*Button button1 = controller.button1;
        button1.setOnAction(actionEvent -> System.out.println("test por aki"));
        button1.setText("Hello world :D!");*/


    }
}
