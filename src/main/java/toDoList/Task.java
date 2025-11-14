package toDoList;

import java.io.Serializable;

public class Task implements Serializable {



    private String text;
    private boolean isCompleted;

    public Task(String text) {

        this.text = text;
        this.isCompleted = false;
    }


    public String getText() {
        return text;
    }

    public void editText(String text) {
        this.text = text;
    }

    public void markCompleted() {
        isCompleted = true;
    }


    public void setCompleted() {
        isCompleted = true;
    }


    @Override
    public String toString() {
        return String.format("[%s] %s",
                isCompleted ? "✓" : "X", text);
    }

}
