package com.example.projectfx.controller;

import com.example.projectfx.HelloApplication;
import com.example.projectfx.objectReaderWriter.FileWriterTXT;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

import java.io.IOException;


public class WorkerController {
    FileWriterTXT fileWriter;
    HelloApplication ha;

    @FXML
    private TableView<?> workerBD;

    @FXML
    private TableView<?> workerBDZakaz;

    @FXML
    private Button workerDelete;

    @FXML
    private Button workerEdit;

    @FXML
    private ComboBox<?> workerFlowerComboBox;

    @FXML
    private Button workerNew;

    @FXML
    protected void onTableWindowShowWrite(ActionEvent event) throws IOException {
        fileWriter.write(ha.);
//        Stage stage = new Stage();
//        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("worker.fxml")); //создаем загрузчик
//        stage.setScene(new Scene(loader.load()));
//        stage.setTitle("My modal window");
//        stage.initModality(WINDOW_MODAL);
//        stage.initOwner(((Node)event.getSource()).getScene().getWindow());
//        WorkerController workerController = loader.getController(); //получаем контроллер
////        Person newPerson = new Person(textField.getText(), (int) slider.getValue(), Person.Position.DEV);
////        tableController.onTransferData(newPerson); //передаем данные
//        stage.show();

    }

    @FXML
    protected void onTableWindowShowRead(ActionEvent event) throws IOException {

    }


}
