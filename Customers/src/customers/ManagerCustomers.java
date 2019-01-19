/*
 * add,edit,delete ,update customer
 */
package customers;



import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomers {
    public static Scanner scanner = new Scanner(System.in);
    private List<Customers> CustomerList;
    private ListCustomers CustomerRW;
     
  
    public ManagerCustomers() {
        CustomerRW = new ListCustomers();
        CustomerList = CustomerRW.read();
    }
    
  
    public void add() {
        int id = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
        System.out.println("customers id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        int Phone = inputPhone();
        Customers customers = new Customers(id, name, age, address, Phone);
        CustomerList.add(customers);
        CustomerRW.write(CustomerList);
    }
    

    
    public void editId(int id){
        boolean isExisted  = false;
        int size = CustomerList.size();
        for(int i =0; i<size; i++){
            if (CustomerList.get(i).getID() == id) {
                isExisted = true;
                CustomerList.get(i).setName(inputName());
                CustomerList.get(i).setAge(inputAge());
                CustomerList.get(i).setAddress(inputAddress());
                CustomerList.get(i).setPhone(inputPhone());
            }
            
        }
        if (!isExisted) {
            System.err.println("id not existed "+ id);
        }else{
            CustomerRW.write(CustomerList);
        }
    }
    
    public void deleteId(int id){
       Customers customers = null;
        int size = CustomerList.size();
        for (int i = 0; i < size; i++) {
            if (CustomerList.get(i).getID() == id) {
                customers = CustomerList.get(i);
                break;
            }
        }
        if (customers != null) {
            CustomerList.remove(customers);
            CustomerRW.write(CustomerList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }  
    }
    
    
  
 
    /**
     * show list customers to screen
     */
    public void show() {
         System.out.printf("\n%5s %23s %10s %21s %15s\n","ID","Hoten","tuoi","Diachi","Phone");
        for (Customers customers : CustomerList) {
            System.out.format("%5d  | ", customers.getID());
            System.out.format("%20s | ", customers.getName());
            System.out.format("%5d  | ", customers.getAge());
            System.out.format("%20s | ", customers.getAddress());
            System.out.format("%15d%n", customers.getPhone());
        }
    }
    
    /**
     * Search theo ten customers
     * @return 
     */
    public void Search()
    {
        String Name;
        int size = CustomerList.size();
        System.out.println("Enter the name you want to find: ");
        Name = inputName();
        System.out.printf("Search by name: %s",Name);
        System.out.printf("\n%5s %23s %10s %21s %15s\n","ID","Hoten","tuoi","Diachi","Phone");
        for (int i = 0; i < size; i++) {
            if(CustomerList.get(i).getName().equals(Name))
            {
                System.out.format("%5d  | ", CustomerList.get(i).getID());
                System.out.format("%20s | ", CustomerList.get(i).getName());
                System.out.format("%5d  | ", CustomerList.get(i).getAge());
                System.out.format("%20s | ", CustomerList.get(i).getAddress());
                System.out.format("%15d%n", CustomerList.get(i).getPhone());
            }
        }
    }
    
    //input data
    public int inputId() {
        System.out.print("Input customers id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input customers id again: ");
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
        System.out.printf("Input customers age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.printf("invalid! Input customers id again: ");
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
                System.out.printf("invalid! Input customers id again: ");
            }
        }
    }
    
     // getter && setter
    public List<Customers> getCustomersList() {
        return CustomerList;
    }
 
    public void setCustomersList(List<Customers> CustomerList) {
        this.CustomerList = CustomerList;
    }


  
}
