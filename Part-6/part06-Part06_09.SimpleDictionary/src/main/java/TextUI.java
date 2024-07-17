/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.Scanner;
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simple;
    
    public TextUI(Scanner scanner, SimpleDictionary simple){
        this.scanner = scanner;
        this.simple = simple;
    }
    
    public void start(){   
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.println("Word:");
                String translate = scanner.nextLine();
                System.out.println("Translation:");
                String translateTo = scanner.nextLine();
                simple.add(translate, translateTo);
                
            } else if(command.equals("search")){
                System.out.println("To be translated:");
                String toTranslate = scanner.nextLine();
                if(simple.translate(toTranslate) == null){
                System.out.println("Word " + toTranslate + " was not found");
            }else{
                System.out.println("Translation: "+simple.translate(toTranslate));    
                }
            }else{
                System.out.println("Unknown command");
            }
        }
    }
    
    
    
}
