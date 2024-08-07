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
    private firstContainer first;
    private secondContainer second;
    
    public UserInterface(Scanner scanner, firstContainer first, secondContainer second){
        this.scanner = scanner;
        this.first  = first;
        this.second = second;
    }
    
    public void start(){
        //System.out.println("start");
        while(true){
            System.out.println("First: "+first.getLiquid()+"/100");
            System.out.println("Second: "+second.getLiquid()+"/100");
            
            String text = scanner.nextLine();
            if(text.equals("quit")){
                break;
            }
            if(text.contains("add")){
                String[] parts = text.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if(amount+first.getLiquid() < 100){
                    first.add(amount);
                }else{
                    first.add(100-first.getLiquid());
                }
            }
            if(text.contains("move") && !(text.contains("remove"))){
                String[] parts = text.split(" ");
                int amount = Integer.valueOf(parts[1]);
                
                first.move(amount);
            }
            if(text.contains("remove")){
                String[] parts = text.split(" ");
                int amount = Integer.valueOf(parts[1]);
                
                second.remove(amount);
            }
        }
    }
}
