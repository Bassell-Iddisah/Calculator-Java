module com.example.calculatorjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorjava to javafx.fxml;
    exports com.example.calculatorjava;
    exports com.example.calculatorjava.controller;
    opens com.example.calculatorjava.controller to javafx.fxml;
}