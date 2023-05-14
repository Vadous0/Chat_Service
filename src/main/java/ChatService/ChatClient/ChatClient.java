package ChatService.ChatClient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatClient extends Application {


    //TODO GUI erstellen
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(ChatClient.class.getResource("GUI.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(ChatClient.class.getResource("GUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    // TODO Methode implementieren
    public void connectToServer(int port, String ip_adress){
    }
    // TODO Methode implementieren
    public void close_connection(){
        System.out.println("Hello");
    }
    // TODO Methode implementieren
    public void handle_connection(){
    }


    public static void main(String[] args) {
        launch();
    }
}