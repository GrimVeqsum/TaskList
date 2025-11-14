package toDoList;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    String path = "storage.txt";
    public void save(List<Task> tasks) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Task> load() {
        File file = new File(path);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Task>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    // метод save(tasks)
    // открыть файл → записать список задач

    // метод load()
    // открыть файл → прочитать список → вернуть
}
