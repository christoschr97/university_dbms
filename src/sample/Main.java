package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        BorderPane borderPane = new BorderPane();
        Button btn = new Button("Test Button");
        borderPane.setBottom(btn);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(borderPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}
