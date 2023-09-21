module com.example.ex15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex15 to javafx.fxml;
    exports com.example.ex15;
}