package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    Button button1;

    @FXML
    MenuBar mainmenu;

    @FXML
    private void handleButton1Click(ActionEvent actionEvent){
        System.out.println("Hola " + ((Button) actionEvent.getSource()).getId());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mainmenu.setUseSystemMenuBar(true);
        System.out.println("Hello world!");
    }
}
