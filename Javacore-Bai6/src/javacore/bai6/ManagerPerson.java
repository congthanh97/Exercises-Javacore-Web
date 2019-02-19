/*
 * add,edit,delete ,update customer
 */
package javacore.bai6;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerPerson {
    public static Scanner scanner = new Scanner(System.in);
    private List<Person> PersonList;
    private ListPerson PersonRW;
     
  
    public ManagerPerson() {
        PersonRW = new ListPerson();
        PersonList = PersonRW.read();
    }
    
  
    public void add() {
        int id = (PersonList.size() > 0) ? (PersonList.size() + 1) : 1;
        System.out.println("person id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        int Phone = inputPhone();
        Person person = new Person(id, name, age, address, Phone);
        PersonList.add(person);
        PersonRW.write(PersonList);
    }
    

    
    public void editId(int id){
        boolean isExisted  = false;
        int size = PersonList.size();
        for(int i =0; i<size; i++){
            if (PersonList.get(i).getID() == id) {
                isExisted = true;
                PersonList.get(i).setName(inputName());
                PersonList.get(i).setAge(inputAge());
                PersonList.get(i).setAddress(inputAddress());
                PersonList.get(i).setPhone(inputPhone());
            }
            
        }
        if (!isExisted) {
            System.err.println("id not existed "+ id);
        }else{
            PersonRW.write(PersonList);
        }
    }
    
    public void deleteId(int id){
       Person person = null;
        int size = PersonList.size();
        for (int i = 0; i < size; i++) {
            if (PersonList.get(i).getID() == id) {
                person = PersonList.get(i);
                break;
            }
        }
        if (person != null) {
            PersonList.remove(person);
            PersonRW.write(PersonList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }  
    }
        
     /**
     * sort student by name
     */
    public void sortPersonNameT() {
        Collections.sort(PersonList, new SortPersonNameT());
       
    }
     public void sortPersonNameG() {
        Collections.sort(PersonList, new SortPersonNameG());
       
    }
     
//     public void sort(){
//         boolean order =  false;
//         System.out.printf("Order(Y/N): ");
//         String Ip = scanner.nextLine();;
//         if(Ip == "Y"){
//             //order = true;
//             Collections.sort(PersonList, new SortPersonNameT());
//         }
//         else {
//             order =  false;
//             Collections.sort(PersonList, new SortPersonNameG());
//            
//         }
//         // this.show();
//     }
//    
     public void sort(boolean order){
         System.out.printf("Order(Y/N): ");
     
     }
    
  
 
    /**
     * show list person to screen
     */
    public void show() {
         System.out.printf("\n%5s %23s %10s %21s %15s\n","ID","Hoten","tuoi","Diachi","Phone");
        for (Person person : PersonList) {
            System.out.format("%5d  | ", person.getID());
            System.out.format("%20s | ", person.getName());
            System.out.format("%5d  | ", person.getAge());
            System.out.format("%20s | ", person.getAddress());
            System.out.format("%15d%n",  person.getPhone());
        }
    }
    
    /**
     * Search theo ten person
     * @return 
     */
    public void Search()
    {
        String Name;
        int size = PersonList.size();
        System.out.println("Enter the name you want to find: ");
        Name = inputName();
        System.out.printf("Search by name: %s",Name);
        System.out.printf("\n%5s %23s %10s %21s %15s\n","ID","Hoten","tuoi","Diachi","Phone");
        for (int i = 0; i < size; i++) {
            if(PersonList.get(i).getName().equals(Name))
            {
                System.out.format("%5d  | ", PersonList.get(i).getID());
                System.out.format("%20s | ", PersonList.get(i).getName());
                System.out.format("%5d  | ", PersonList.get(i).getAge());
                System.out.format("%20s | ", PersonList.get(i).getAddress());
                System.out.format("%15d%n", PersonList.get(i).getPhone());
            }
        }
    }
    
    //input data
    public int inputId() {
        System.out.print("Input person id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input person id again: ");
            }
        }
    }
    
    private String inputName(){
        System.out.printf("Input name: ");
        return scanner.nextLine();
    }
    
    private String inputAddress(){
        System.out.printf("Input Address: ");
        return scanner.nextLine();
    }
    
    private byte inputAge() {
        System.out.printf("Input person age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.printf("invalid! Input person id again: ");
            }
        }
    }
     
    private int inputPhone() {
        System.out.printf("Input Phone: ");
        while (true) {
            try {
                int phone = Integer.parseInt((scanner.nextLine()));
                if (phone < 0 && phone > 11) {
                    throw new NumberFormatException();
                }
                return phone;
            } catch (NumberFormatException ex) {
                System.out.printf("invalid! Input person id again: ");
            }
        }
    }
    
     // getter && setter
    public List<Person> getPersonList() {
        return PersonList;
    }
 
    public void setPersonList(List<Person> PersonList) {
        this.PersonList = PersonList;
    }


  
}
