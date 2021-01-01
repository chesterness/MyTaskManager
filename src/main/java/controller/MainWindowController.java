package controller;

import controller.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.awt.*;

public class MainWindowController {

    @FXML private Label label;
    @FXML private TextField field;

    private Person person;

    private Main main;

    public void setMain(Main main) {
        this.main = main;
        person = new Person("Charlie", "Brown", "25");
    }

    public void handleButton(){
        String text = field.getText();

        label.setText(person.getFirstName());
        field.clear();
    }
}
