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
    private ArrayList<Integer> list;
    private Scanner scanner;
    
    public UserInterface(ArrayList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("Enter points totals, -1 stops:");
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                break;
            }
            list.add(number);
        }
        System.out.println("Point average (all): "+ average());
        System.out.println("Point average(passing: "+passingGrade());
        System.out.println("Pass percentage: "+passPercentage());
        gradeDis();
    }
    
    public double average(){
        double average = 0;
        int counter = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 0 && list.get(i) <= 100){
            average += (double) list.get(i);
            counter++;
            }
        }
        return average/counter;
    }
    public String passingGrade(){
        double average = 0;
        int counter = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 50 && list.get(i) <= 100){
                average += (double) list.get(i);
                counter++;
            }
        }
        if(average == 0){
            return "-";
        }
        return String.valueOf(average/counter);
    }
    
    public double passPercentage(){
        double passCounter = 0;
        double counter = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 50 && list.get(i) <= 100){
                passCounter++;
                counter++;
            }else if(list.get(i) >= 0 && list.get(i) <= 100){
                counter++;
            }
        }
        if(passCounter == 0){
            return 0;
        }
        //System.out.println("Counter: "+counter);
        //System.out.println("Pass: "+passCounter);
        return 100*passCounter / counter;
    }
    
    public void gradeDis(){
        byte nu = 0;
        byte ei = 0;
        byte zw = 0;
        byte dr = 0;
        byte vi = 0;
        byte fü = 0;
        
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 0 && list.get(i) <= 100 ){
                if(list.get(i) >= 90){fü++;}
                if(list.get(i) < 90 && list.get(i) >= 80){vi++;}
                if(list.get(i) < 80 && list.get(i) >= 70){dr++;}
                if(list.get(i) < 70 && list.get(i) >= 60){zw++;}
                if(list.get(i) < 60 && list.get(i) >= 50){ei++;}
                if(list.get(i) < 50 ){nu++;}  
            }
        }         
        
        
        System.out.println("5: "+printStars(fü));
        System.out.println("4: "+printStars(vi));
        System.out.println("3: "+printStars(dr));
        System.out.println("2: "+printStars(zw));
        System.out.println("1: "+printStars(ei));
        System.out.println("0: "+printStars(nu));
        }
    
        
    public String printStars(int amount){
        String stars = "";
        for (int i = 0; i < amount; i++) {
            stars += "*";
        }
        return stars;
    }
}
    

