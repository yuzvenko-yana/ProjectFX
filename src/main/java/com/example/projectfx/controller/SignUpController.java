package com.example.projectfx.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.projectfx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.stage.Modality.WINDOW_MODAL;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private CheckBox SignUpChekBoxMan;

    @FXML
    private CheckBox SignUpChekBoxWomen;

    @FXML
    private PasswordField SignUpContry;

    @FXML
    private TextField SignUpLastName;

    @FXML
    private TextField SignUpName;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    protected void onTableWindowShow(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("worker.fxml")); //создаем загрузчик
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("My modal window");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node)event.getSource()).getScene().getWindow());
        WorkerController workerController = loader.getController(); //получаем контроллер
//        Person newPerson = new Person(textField.getText(), (int) slider.getValue(), Person.Position.DEV);
//        tableController.onTransferData(newPerson); //передаем данные
        stage.show();
    }
}

