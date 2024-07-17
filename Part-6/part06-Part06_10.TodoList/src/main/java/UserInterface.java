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

public class UserInterface {
    
    private Scanner scanner;
    private TodoList toDo;
    
    public UserInterface(TodoList toDo, Scanner scanner){
        this.toDo = toDo;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.println("To add: ");
                String addition = scanner.nextLine();
                toDo.add(addition);
            }
            if(command.equals("list")){
                toDo.print();
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int remove = Integer.parseInt(scanner.nextLine());
                toDo.remove(remove);
            }
        }
    }
    
}
