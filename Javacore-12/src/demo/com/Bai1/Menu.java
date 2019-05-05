package demo.com.Bai1;

import java.util.*;
import java.io.*;

public class Menu {
    private Map<String, String> map = new HashMap<>();

    public Menu() {
        this.fileData("menu-vi.locale");
    }

    public void fileData(String fi) {
        try {
            String filePath = fi;
            BufferedReader reader = new BufferedReader(new FileReader(filePath));;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=",2);
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.printf("\n------%s------", this.map.get("menu"));
            System.out.printf("\n1. %s", this.map.get("add"));
            System.out.printf("\n2. %s", this.map.get("search"));
            System.out.printf("\n3. %s", this.map.get("update"));
            System.out.printf("\n4. %s", this.map.get("delete"));
            System.out.printf("\n5. %s", this.map.get("save"));
            System.out.printf("\n6. %s", this.map.get("lang"));
            System.out.printf("\n7. %s", this.map.get("exit"));
            System.out.printf("\n%s", this.map.get("choose"));
            int c = Integer.parseInt(input.nextLine());

            switch (c) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.print(this.map.get("mess"));
                    int chose = Integer.parseInt(input.nextLine());
                    if (chose == 1) {
                        this.fileData("menu-en.locale");
                    } else if (chose == 2) {
                        this.fileData("menu-vi.locale");
                    } else if (chose == 3) {
                        this.fileData("menu-jp.locale");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not valid");
            }
        }

    }
}
