package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(
                "Main.fxml"));
        Parent root = (Parent) loader.load();
        //PersonEditorCtrl ctrl = loader.getController();

        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));


        // el scene contiene al ROOT NODE
        Scene scene = new Scene(root, 300, 250);

        // configurar y mostrar el stage
        primaryStage.setTitle("Hola JavaFX 8");
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller controller = (Controller) loader.getController();
        /*Button button1 = controller.button1;
        button1.setOnAction(actionEvent -> System.out.println("test por aki"));
        button1.setText("Hello world :D!");*/


    }



    public static void main(String[] args) {
        Application.launch(args);
    }
}
