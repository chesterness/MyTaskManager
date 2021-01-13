package model;

import java.time.LocalDate;

public class Task {

    //fields
    private String taskContent;
    private LocalDate dueDate;

    //constructors
    public Task(String taskContent, LocalDate dueDate){
        this.taskContent = taskContent;
        this.dueDate = dueDate;
    }
    public Task(String taskContent){
        this.taskContent = taskContent;
    }

    //getters
    public String getTaskContent() { return taskContent; }
    public String getDueDate() {
        return dueDate.toString();
    }


    //setters
    public void setTaskContent(String taskContent) { this.taskContent = taskContent; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

}
