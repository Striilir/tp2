package fr.univ_amu.iut.exercice4;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.stage.Stage;

public class MySecondJavaFXWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Second Useless JavaFX Window");
        primaryStage.setAlwaysOnTop(true);

    }
}
