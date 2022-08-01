module com.example.baseballapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baseballapp to javafx.fxml;
    exports com.example.baseballapp;
}