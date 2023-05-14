package ChatService.ChatClient;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ChatClientController {

    //TODO Methoden implementieren
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}