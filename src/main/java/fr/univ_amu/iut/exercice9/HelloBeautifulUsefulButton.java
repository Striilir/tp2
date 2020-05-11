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
        primaryStage.setScene(s);
        ImageView Img = new ImageView("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        Img.setFitHeight(150);
        Img.setFitWidth(150);
        Button button = new Button("Hello !",Img);
        button.setId("buttonHello");
        root.setCenter(button);
        primaryStage.show();
    }
}
