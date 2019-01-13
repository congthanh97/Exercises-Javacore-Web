/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorebai7kethua;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class StoreManager {
    public static Scanner scanner = new Scanner(System.in);
   String Choice = null;
   
    //smartphone
    private List<Smartphone> SmartphoneList;
    private SmartphoneRW smartphoneRW;
    //camera
    private List<Camera> CameraList;
    private CameraRW cameraRW;
  
    public StoreManager() {
        smartphoneRW = new SmartphoneRW();
        SmartphoneList = smartphoneRW.read();
        
        //camera
        cameraRW = new CameraRW();
        CameraList = cameraRW.read();
    }
    
    
    public void addProduct()
    {
            System.out.println("Nhap vao lua chon ");
            System.out.print("\n1.Smartphone");
            System.out.print("\n2.Camera\n");
            System.out.printf("Choose: ");
            Choice = scanner.nextLine();
            switch(Choice){
                case "1": 
                    Smartphone smartphone = new Smartphone();
                    smartphone.addNew();
                    SmartphoneList.add(smartphone);
                    smartphoneRW.write(SmartphoneList);
                    break;
                case "2":
                    Camera camera = new Camera();
                    camera.addNew();
                    CameraList.add(camera);
                    cameraRW.write(CameraList);     
                    break;
            }
         
    }
    
    //Delete product
    public void DeleteId(){
            System.out.println("Enter choose ");
            System.out.print("\n1.Smartphone");
            System.out.print("\n2.Camera\n");
            System.out.printf("Choose: ");
            Choice = scanner.nextLine();
            switch(Choice){
                case "1": 
                    int smId = inputId();
                    deleteSmartId(smId);
                    break;
                case "2":
                    int caId = inputId();
                    deleteCameraId(caId);    
                    break;
            }
        
        
    }
    
    //delete smarphone
     public void deleteSmartId(int id){
       Smartphone smartphone = null;
        int size = SmartphoneList.size();
        for (int i = 0; i < size; i++) {
            if (SmartphoneList.get(i).getId() == id) {
                smartphone = SmartphoneList.get(i);
                break;
            }
        }
        if (smartphone != null) {
            SmartphoneList.remove(smartphone);
            smartphoneRW.write(SmartphoneList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }  
    }
    
    
    
    //delete camera
     public void deleteCameraId(int id){
       Camera camera = null;
        int size = CameraList.size();
        for (int i = 0; i < size; i++) {
            if (CameraList.get(i).getId() == id) {
                camera = CameraList.get(i);
                break;
            }
        }
        if (camera != null) {
            CameraList.remove(camera);
            cameraRW.write(CameraList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }  
    }
    
     
     //Edit product ID
     public void EditId(){
           System.out.println("Enter choose ");
            System.out.print("\n1.Smartphone");
            System.out.print("\n2.Camera\n");
            System.out.printf("Choose: ");
            Choice = scanner.nextLine();
            switch(Choice){
                case "1": 
                    int smId = inputId();
                    editId(smId);
                    break;
                case "2":
                    int caId = inputId();
                    deleteCameraId(caId);    
                    break;
            }
         
     }
     
     //edit Smartphone
     
    public void editId(int id){
        boolean isExisted  = false;
        int size = SmartphoneList.size();
        for(int i =0; i<size; i++){
            if (SmartphoneList.get(i).getId() == id) {
                isExisted = true;
                SmartphoneList.get(i).addNew();
            }
            
        }
        if (!isExisted) {
            System.err.printf("id %d not existed ",id);
        }else{
            smartphoneRW.write(SmartphoneList);
        }
    }
    
    public void showSmartPhone() {
        System.out.println("\n\t\t\tDanh sach smartphone");
         System.out.printf("\n%5s %23s %10s %21s \n","ID","Hoten","Price","Quantity");
        for (Smartphone smartphone : SmartphoneList) {
            System.out.format("%5d  | ", smartphone.getId());
            System.out.format("%20s | ", smartphone.getName());
            System.out.format("%10f  | ", smartphone.getPrice());
            System.out.format("%10d%n",smartphone.getQuantity());

        }
    }
    
    public void showCamera() {
        System.out.println("\n\t\t\tDanh sach camera\n");
        System.out.printf("\n%5s %23s %10s %21s \n","ID","Hoten","Price","Quantity");
        for (Camera camera: CameraList) {
            System.out.format("%5d  | ", camera.getId());
            System.out.format("%20s | ", camera.getName());
            System.out.format("%10f  | ", camera.getPrice());
            System.out.format("%10d%n",camera.getQuantity());

        }
    }
    
    
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    
    
    
}
