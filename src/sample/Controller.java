package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text meowText;

    @FXML
    private Button clickMeButton;

    @FXML
    private TextField userInput;

    public void clickedTheButton(ActionEvent actionEvent){
        String userEntry = userInput.getText();
        meowText.setText("Hello, " + userEntry);
        userInput.clear();
    }
}
