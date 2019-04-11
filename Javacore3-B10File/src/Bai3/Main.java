
package Bai3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        int c = 0;
       // String choose = null;
        boolean exit = false;
        TaskManager taskManager = new TaskManager();
        int taskId;
        showMenu();
        while (true) {
            c = Integer.parseInt(scanner.nextLine());
           // choose = scanner.nextLine();
            switch (c) {
            case 1:
                taskManager.add();
                break;
            case 2:
                  taskManager.show();
                break;
            case 3:
                taskManager.filterByStatus();
                break;
            case 4:
                taskId= taskManager.inputId();
                taskManager.editId(taskId);
                break;
            case 5:
                taskId= taskManager.inputId();
                taskManager.deleteId(taskId);
                break;
            case 6:
                taskId= taskManager.inputId();
                taskManager.Detail(taskId);
                break;
            case 0:
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
     public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. addTask");
        System.out.println("2. Show task");
        System.out.println("3. Filter by Status");
        System.out.println("4. Update Status");
        System.out.println("5. DeleteId");
        System.out.println("6. View Detail");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
