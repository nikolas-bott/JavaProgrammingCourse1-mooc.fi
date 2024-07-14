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
    
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
           
            String input = scanner.nextLine();
            if(input.equals("X")){
                break;
            }
            
            if(input.equals("1")){
                System.out.println("Write the joke to be added: ");
                String jokeToAdd = scanner.nextLine();
                jokes.addJoke(jokeToAdd);
            }
            
            if(input.equals("2")){
                System.out.println(jokes.drawJoke());
            }
            
            if(input.equals("3")){
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            }
            
        }
    }
    
}
