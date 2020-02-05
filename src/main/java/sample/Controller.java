package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    @FXML
    Button button1;

    @FXML
    private void handleButton1Click(ActionEvent actionEvent){
        System.out.println("Hola " + ((Button) actionEvent.getSource()).getId());
    }

}
