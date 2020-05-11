package fr.univ_amu.iut.exercice6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloLabel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        primaryStage.setHeight(100);
        primaryStage.setWidth(250);
        BorderPane root = new BorderPane();
        Scene s = new Scene(root, 100, 250);
        primaryStage.setScene(s);
        Label label = new Label("Hello !");
        label.setId("labelHello");
        root.setCenter(label);
        primaryStage.show();

    }
}
