
package Bai3;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Task> listTask;
    private ListTaskRW taskRW;
    
     public TaskManager() {
        taskRW = new ListTaskRW();
        listTask = taskRW.read();
     }
     
    public void add(){
        int id = (listTask.size() >0) ? (listTask.size()+ 1) : 1;
        System.out.println("Tasks id = "+ id);
        scanner.nextLine();
        String title = inpuTitle();
        String content =  inputContent();
        boolean done =  inputDone();
        Task task = new Task(id, title, content , done);
        listTask.add(task);
        taskRW.write(listTask);
    }
    
    //showAll
    public void show() {
        System.out.printf("\n%5s %23s %18s\n","ID","Title","Done");
        for (Task task : listTask) {
            System.out.format("%5d  | ", task.getId());
            System.out.format("%20s | ", task.getTitle());
            System.out.format("%15s%n",  task.isDone() == true ? "Yes" : "False");
        }
    }
    
    
    
    //update edit
    public void editId(int id){
        boolean isExisted  = false;
        int size = listTask.size();
        for(int i =0; i<size; i++){
            if (listTask.get(i).getId() == id) {
                isExisted = true;
                listTask.get(i).setDone(inputDone()); 
            }
            
        }
        if (!isExisted) {
            System.err.println("id not existed "+ id);
        }else{
            taskRW.write(listTask);
        }
    }
    
    //delete id
     public void deleteId(int id){
        Task task = null;
        int size = listTask.size();
        for (int i = 0; i < size; i++) {
            if (listTask.get(i).getId() == id) {
                task = listTask.get(i);
                break;
            }
        }
        if (task != null) {
            listTask.remove(task);
            taskRW.write(listTask);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }  
    }
     //viewdetail
     public void Detail(int id){
        boolean isExisted  = false;
        int size = listTask.size();
        System.out.printf("\n%5s %23s %23s %18s\n","ID","Title","Content","Done");
        for(int i =0; i< size; i++){
            if (listTask.get(i).getId() == id) {
                isExisted = true;
                System.out.format("%5d  | ", listTask.get(i).getId());
                System.out.format("%20s | ", listTask.get(i).getTitle());
                System.out.format("%20s | ", listTask.get(i).getConntent());
                System.out.format("%15s%n",  listTask.get(i).isDone() == true ? "Yes" : "False");
            }  
        }
        if (!isExisted) {
            System.err.println("id not existed "+ id);
        }
         
     }
    
     //
     public void filterByStatus(){
        Collections.sort(listTask, (Done1, Done2) -> Boolean.compare(Done2.isDone(), Done1.isDone())); 
         taskRW.write(listTask);
     }
     
//     
    
    public int inputId() {
        System.out.print("Input Task id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input task id again: ");
            }
        }
    }
    
    private String inpuTitle(){
        System.out.printf("Input Title: ");
        return scanner.nextLine();
    }
    
    private String inputContent(){
        System.out.printf("Input Conntent: ");
        return scanner.nextLine();
    }
    
      private boolean inputDone(){
        System.out.printf("Input done(true/false): ");
        return scanner.nextBoolean();
    }
    
    
}
