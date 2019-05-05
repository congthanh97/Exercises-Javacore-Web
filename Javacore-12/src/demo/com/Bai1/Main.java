package demo.com.Bai1;

import java.util.HashMap;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        do {
//            System.out.println("-------MENU-------");
//            System.out.println("1. Add new");
//            System.out.println("2. Search by name");
//            System.out.println("3. Update ");
//            System.out.println("4. Delete ");
//            System.out.println("5. Save");
//            System.out.println("6. Language");
//            System.out.println("7. Exit");
//            System.out.printf("Chose: ");
//            int c = Integer.parseInt(input.nextLine());
//            switch (c) {
//                case 1:
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    System.out.println("1: VN");
//                    System.out.println("2: En");
//                    System.out.println("Chose: ");
//                    int chose = Integer.parseInt(input.nextLine());
//                    if (chose == 1) {
//                        Menu1("en");
//                    } else {
//                       Menu2();
//                    }
//                    break;
//                case 7:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Error!!!");
//            }
//        } while (true);
//
//    }
//
//    public static void Menu1(String lang) throws FileNotFoundException, IOException {
//        String filePath2 = "menu-" +lang + ".locale";
//        HashMap<String, String> map = new HashMap<String, String>();
//
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader(filePath2));
//        while ((line = reader.readLine()) != null) {
//            String[] parts = line.split("=", 2);;
//            String key = parts[0];
//            String value = parts[1];
//            map.put(key, value);
//        }
////        Set<String> keySet = mapJp.keySet();
////        Iterator<String> keys = keySet.iterator();
//        for (String key : map.keySet()) {
//            System.out.println(map.get(key));
//        }
//        reader.close();
        Menu menu = new Menu();
        menu.show();
    }
}

////    public static void Menu2() throws FileNotFoundException, IOException {
////        String filePath2 = "menu-en.locale";
////        HashMap<String, String> map = new HashMap<String, String>();
////
////        String line;
////        BufferedReader reader = new BufferedReader(new FileReader(filePath2));
////        while ((line = reader.readLine()) != null) {
////            String[] parts = line.split("=", 2);;
////            String key = parts[0];
////            String value = parts[1];
////            map.put(key, value);
////        }
//////        Set<String> keySet = mapJp.keySet();
//////        Iterator<String> keys = keySet.iterator();
////        for (String key : map.keySet()) {
////            System.out.println(map.get(key));
////        }
////        reader.close();
////    }
//
//}
