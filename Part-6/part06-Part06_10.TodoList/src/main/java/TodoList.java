/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
//import java.util.Scanner;
import java.util.ArrayList;
public class TodoList {
   // private Scanner scanner;
    private ArrayList<String> task;
    
    public TodoList(){   
        //this.scanner = new Scanner(System.in);
        this.task = new ArrayList();
    }
    
    public void add(String task){
        this.task.add(task);
    }
    
    public void print(){
        for (int i = 0; i < this.task.size(); i++) {
            int temp = i+1;
            System.out.println(temp+": "+this.task.get(i));
        }
    }
    
    public void remove(int number){
        int temp = number -1;
        task.remove(temp);
    }
    
    
}
