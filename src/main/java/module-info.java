module com.example.chat_service {
    requires javafx.controls;
    requires javafx.fxml;


    exports ChatService.ChatClient;
    opens ChatService.ChatClient to javafx.fxml;
    exports ChatService.ChatServer;
    opens ChatService.ChatServer to javafx.fxml;
}