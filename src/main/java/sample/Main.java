package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(
                "Main.fxml"));
        Parent root = (Parent) loader.load();

        // el scene contiene al ROOT NODE
        Scene scene = new Scene(root, 1920, 1080);

        // configurar y mostrar el stage
        primaryStage.setTitle("Hola JavaFX 8");
        primaryStage.setScene(scene);
        primaryStage.show();




    }



    public static void main(String[] args) {
        Application.launch(args);
    }
}
