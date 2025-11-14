package toDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TaskManager taskManager = new TaskManager();
        TaskStorage storage = new TaskStorage();
        taskManager.setTasks(storage.load());
        // 3) (позже) Загружаешь задачи из файла

        while (true) {

            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println(" 3. Отметить выполненной");
            System.out.println("4. Удалить");
            System.out.println(" 5. Выйти");
            int n = scan.nextInt();
            scan.nextLine();
            switch (n){
                case 1:
                    System.out.print("Введите текст задачи: ");
                    String text = scan.nextLine();
                    taskManager.addTask(text);
                    break;
                case 2:
                    taskManager.showTasks();
                    break;
                case 3:
                    System.out.print("Какая задача выполнена? ");
                 int compNum = scan.nextInt();
                    scan.nextLine();
                    taskManager.completeTask(compNum-1);
                    break;
                case 4:
                    System.out.print("Какую задачу хотите удалить? ");
                    int remNum = scan.nextInt();
                    scan.nextLine();
                    taskManager.removeTask(remNum-1);
                    break;
                case 5:
                    storage.save(taskManager.getTasks());
                    return;
                default:
                    System.out.println("Некорректный ввод");
            }

        }


    }
}
