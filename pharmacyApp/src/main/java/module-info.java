module com.example.pharmacyapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.pharmacyapp to javafx.fxml;
    exports com.example.pharmacyapp;
}