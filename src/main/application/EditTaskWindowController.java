import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Task;

public class EditTaskWindowController {

    @FXML private TextField editTaskTextField;
    @FXML private DatePicker datePicker;
    @FXML private Button submitBButton, cancelButton;

    private Stage stage;
    private Main main;

    public void setMain(Main main, Stage stage){
        this.main = main;
        this.stage = stage;
    }

    @FXML
    public void editTask(){
        // TODO: 12.01.2021
        //find task in file

        //remove old task from file

        //write new task to file
    }

}
