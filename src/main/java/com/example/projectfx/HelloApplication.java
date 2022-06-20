package com.example.projectfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class HelloApplication implements Serializable {
    private static Flower flo1, flo2, flo3;
    private static Fertilize one, two;
    private static Producer pr1, pr2;
    public static List<Flower> flowerList = new ArrayList<>();




    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com.example.fileSceneBuilder/signUp.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        pr1 = new Producer("Fertica", "fertica_fertilizer@gmail.com",1);
        pr2 = new Producer("Biola", "biola_fertilizer@gmail.com",2);
        one = new Fertilize(50, pr1, true,1);
        two = new Fertilize(60, pr2, false,2);
        flo1 = new Flower(1,"Ромашка", "while", false, one);
        flo2 = new Flower(2,"Васильки", "blue", false, one);
        flo3 = new Flower(3,"Васильки", "blue", true, two);
        flowerList.add(flo1);
        flowerList.add(flo2);
        flowerList.add(flo3);

    }
}