/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    
    private ArrayList<Bird> list;
    private Scanner scanner;
    
    Commands com = new Commands(this.list);
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.list = new ArrayList<>();
        this.com = new Commands(this.list);
    }
    
    
    
    public void start(){
        while(true){
            System.out.println("?");
            String temp = scanner.nextLine();
            
            if(temp.equals("Quit")){
                break;
            }
            if(temp.equals("Observation")){
                System.out.println("Bird?");
                String bird = scanner.nextLine();
               /* int liste = com.getList().size();
                for (int i = 0; i < com.getList().size(); i++) {
                    //System.out.println(i);
                    if(com.getList().get(i).toString().contains(bird)){
                        com.getList().get(i).setObs(1);
                        break;
                    }else{
                        liste--;
                    }
                    if(liste == 0){
                    System.out.println("Not a bird!");
                    }   */
                    //String bird = scanner.nextLine();
                    com.incrementObservation(bird);
                }
                
                //com.observation();
            if(temp.equals("Add")){
                
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                
                com.add(name, latinName);
            }
            if(temp.equals("One")){
              /*  if(!(com.getList().isEmpty())){
                    com.printOne();
                }*/
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                com.printOne(bird);
            }
            if(temp.equals("All")){
                if(!(com.getList().isEmpty())){
                    com.printAll();
                }
            }
            
        }
    }
    
    
    
}
