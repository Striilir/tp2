package fr.univ_amu.iut.exercice9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulUsefulButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        primaryStage.setHeight(250);
        primaryStage.setWidth(250);
        BorderPane root = new BorderPane();
        Scene s = new Scene(root, 250, 250);
        s.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());
        primaryStage.setScene(s);
        ImageView image = new ImageView("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        image.setFitHeight(150);
        image.setFitWidth(150);
        Button bouton = new Button("Hello !",image);
        bouton.setId("buttonHello");
        root.setCenter(bouton);
        bouton.setOnAction(new EcouteurSimple());
        primaryStage.show();

    }
}