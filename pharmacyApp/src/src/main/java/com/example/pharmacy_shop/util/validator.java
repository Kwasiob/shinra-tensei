package com.example.pharmacy_shop.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Validator {

    public boolean isValidInteger(String str) {
        try {
            int a = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            showAlert("Please enter a number", AlertType.ERROR);
            return false;
        }
    }

    public boolean isValidFloat(String str) {
        try {
            float a = Float.parseFloat(str);
            return true;
        } catch (NumberFormatException nfe) {
            showAlert("Please enter a number", AlertType.ERROR);
            return false;
        }
    }

    public boolean isStringValid(String str) {
        if (str.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void showAlert(String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
