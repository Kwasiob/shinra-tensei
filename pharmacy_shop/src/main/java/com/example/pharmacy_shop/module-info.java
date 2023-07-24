module com.example.pharmacy_shop {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pharmacy_shop to javafx.fxml;
    exports com.example.pharmacy_shop;
}