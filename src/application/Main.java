package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;


    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Welcome.fxml"));
            Parent root = loader.load();

            Scene welcomeScene = new Scene(root, 400, 600);

            primaryStage.setScene(welcomeScene);
            primaryStage.setTitle("To-Do App");
            primaryStage.show();

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
