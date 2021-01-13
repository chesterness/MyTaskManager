import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Task;
import java.time.LocalDate;

import java.util.List;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        mainWindow();
    }

    public void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/MainWindowView.fxml"));
            AnchorPane pane = loader.load();

            Scene scene = new Scene(pane);

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);

            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editTaskWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../view/EditTaskWindowView.fxml"));
            AnchorPane pane = loader.load();

            Scene scene = new Scene(pane);
            Stage stage = new Stage();

            EditTaskWindowController editTaskWindowController = loader.getController();
            editTaskWindowController.setMain(this, stage);

            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //observable list
    private ObservableList<Task> taskDataOL = FXCollections.observableArrayList();
    public ObservableList<Task> getTaskDataOL() { return taskDataOL; }

    //adding data from file to ObservableList
    public void addDataToObservableList(){
        // TODO: 12.01.2021
        //read task data from file
        // TODO: 12.01.2021
        //write task data to ObservableList
        // TODO: 12.01.2021
    }

    public static void main(String[] args) {
        launch(args);
    }
}

