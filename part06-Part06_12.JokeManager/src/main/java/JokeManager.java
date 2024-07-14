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
import java.util.Random;
import java.util.ArrayList;

public class JokeManager {
        private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    
    
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){

        if (jokes.isEmpty()) {
        return "Jokes are in short supply.";
        } else {
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
        }
        
    }
    
    public void printJokes(){
        for (String joke : jokes) {
        System.out.println(joke);
        }
    }
    
      /*  System.out.println("What a joke!");
        while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        String command = scanner.nextLine();
        if (command.equals("X")) {
        break;
        }
        if (command.equals("1")) {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokes.add(joke);
        } else if (command.equals("2")) {
        System.out.println("Drawing a joke.");
        if (jokes.isEmpty()) {
        System.out.println("Jokes are in short supply.");
        } else {
        Random draw = new Random();
        int index = rand.nextInt(jokes.size());
        System.out.println(jokes.get(index));
        }
        } else if (command.equals("3")) {
        System.out.println("Printing the jokes.");
        for (String joke : jokes) {
        System.out.println(joke);
        }
        }
        }*/
}
