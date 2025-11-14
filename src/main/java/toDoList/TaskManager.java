package toDoList;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String text){
        tasks.add(new Task(text));
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void showTasks(){
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, tasks.get(i));

        }
    }
    public void completeTask(int index){
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Некорректный номер задачи.");
            return;
        }
        tasks.get(index).markCompleted();
    }

    public void removeTask(int index){
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Некорректный номер задачи.");
            return;
        }
        tasks.remove(index);
    }


    public void setTasks(List<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }


}
