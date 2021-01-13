import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Task;
import javafx.fxml.FXML;

import java.time.LocalDate;

public class MainWindowController {

    @FXML Button addButton, editButton, deleteButton;
    @FXML TableView<Task> tasksDisplayTable;
    @FXML TableColumn<Task, String> taskContentColumn;
    @FXML TableColumn<Task, LocalDate> dueDateColumn;
    @FXML TextField addTaskTextField;
    @FXML DatePicker addTaskDatePicker;

    private Main main;
    String taskDataFileName = "taskData.txt";

    public void initialize(){
        taskContentColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("taskContent"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<Task, LocalDate>("dueDate"));

        tasksDisplayTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showDetails(newValue));
    }

    private void showDetails(Task task) {
        taskContentColumn.setText(task.getTaskContent());
        dueDateColumn.setText(task.getDueDate());
    }

    public void setMain(Main main) {
        this.main = main;
        tasksDisplayTable.setItems(main.getTaskDataOL());
    }

    @FXML
    public void addTask(){
        Task task = new Task(
                addTaskTextField.getText(),
                addTaskDatePicker.getValue()
        );
        //serialize task
        Serialiser serialiser = new Serialiser();
        String serializedTask = serialiser.serialise(task);
        //add task to file
        DiskIO.writeToFile(taskDataFileName, serializedTask, true);
    }

    @FXML
    public void editTask(){
        main.editTaskWindow();
    }

    @FXML
    public void deleteTask(){
        // TODO: 12.01.2021
        //remove from file
        //https://stackoverflow.com/questions/1377279/find-a-line-in-a-file-and-remove-it
    }
    
}
