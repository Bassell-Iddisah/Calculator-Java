package com.example.calculatorjava.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HelloController {
    StringBuilder displayText = new StringBuilder();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label answerLabel;

    @FXML
    private Pane arithmeticPane;

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button clearButton;

    @FXML
    private Pane displayPane;

    @FXML
    private Button divideButton;

    @FXML
    private Button openParanthesisButton;

    @FXML
    private Button equalsButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button closeParanthesisButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button dotButton;

    @FXML
    private Button plusButton;

    @FXML
    private Label questionLabel;

    @FXML
    private Button timesButton;

    @FXML
    public void initialize() {

    }

    @FXML
    void button0Handler(ActionEvent event) {
        displayText.append("0");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    public void button1Handler(ActionEvent event) {
        displayText.append("1");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button2Handler(ActionEvent event) {
        displayText.append("2");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button3Handler(ActionEvent event) {
        displayText.append("3");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button4Handler(ActionEvent event) {
        displayText.append("4");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button5Handler(ActionEvent event) {
        displayText.append("5");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button6Handler(ActionEvent event) {
        displayText.append("6");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button7Handler(ActionEvent event) {
        displayText.append("7");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button8Handler(ActionEvent event) {
        displayText.append("8");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void button9Handler(ActionEvent event) {
        displayText.append("9");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void openParanthesisButtonHandler(ActionEvent event) {
        displayText.append("(");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void closeParanthesisButtonHandler(ActionEvent event) {
        displayText.append(")");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void deleteButtonHandler(ActionEvent event) {
        if (!displayText.isEmpty()) {
            displayText.deleteCharAt(displayText.length() - 1);
        }
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void clearButtonHandler(ActionEvent event) {
        this.displayText = new StringBuilder("");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void dotButtonHandler(ActionEvent event) {
        displayText.append(".");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void divideButtonHandler(ActionEvent event) {
        displayText.append("/");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void minusButtonHandler(ActionEvent event) {
        displayText.append("-");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void plusButtonHandler(ActionEvent event) {
        displayText.append("+");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void timesButtonHandler(ActionEvent event) {
        displayText.append("x");
        questionLabel.setText(displayText.toString());
    }

    @FXML
    void equalsButtonHandler(ActionEvent event) {
        // Parse stringbuilder then compute answer
    }
}
