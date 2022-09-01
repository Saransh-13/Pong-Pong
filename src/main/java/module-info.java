module com.example.pongpong {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pongpong to javafx.fxml;
    exports com.example.pongpong;
}