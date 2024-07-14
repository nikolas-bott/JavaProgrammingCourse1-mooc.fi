
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        
        while(true){
           String name = scanner.nextLine();
           if(name.equals("")){
               System.out.println("joa");
               break;
           }
           items.add(new Item(name));
           
        }
        
        System.out.println("Hallo");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Name: "+ items.get(i).getName());
            System.out.println(items.get(i).toString());
        }
        
                

    }
}
