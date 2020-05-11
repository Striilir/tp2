package fr.univ_amu.iut.exercice3;

import javafx.application.Application;
import javafx.stage.Stage;

import static java.lang.System.*;

public class WhoIsWho extends Application {

    public static String ThreadOut(String content){
        return '['+Thread.currentThread().getName()+"] "+content;
    }

    public WhoIsWho()
    {
        out.println(ThreadOut("constructeur WhoIsWho()"));
    }

    public static void main(String[] args)
    {
        out.println("main() : avant launch");
        out.println(ThreadOut("main() : avant launch") );
        launch(args);
        out.println(ThreadOut("main() : après launch"));
    }

    @Override
    public void init() throws Exception
    {
        out.println(ThreadOut("init()"));
    }

    @Override
    public void stop() throws Exception
    {
        out.println(ThreadOut("stop()"));
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("WhoIsWho");
        out.println(ThreadOut("start()"));
        primaryStage.show();
    }
}
