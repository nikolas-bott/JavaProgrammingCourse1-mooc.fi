
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if(id.isEmpty()){
                break;
            }
  
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if(list.contains(id)){
                continue;
            }
            
            list.add(id);
            if(name.isEmpty()){
                break;
            }
            list.add(name);
        }
        //Print
        System.out.println("==Items==");
        for (int i = 0; i < list.size(); i++) {
            
            if(!(i ==list.size()-1)){
                System.out.print(list.get(i)+": "); 
            }
           
            
            if(list.size() % 2 == 0){
                i++;
                System.out.println(list.get(i));  
            }
          
        }
    }
    
    
}
