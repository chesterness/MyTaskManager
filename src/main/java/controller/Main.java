package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        mainWindow();
    }

    private void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/MainWindowView.fxml"));
            AnchorPane pane = loader.load();

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);

            Scene scene = new Scene(pane);

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
