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
import java.util.Collections;
import java.util.Comparator;


public class Commands {
    
    private ArrayList<Bird> list;
    private int observation = 0;
    
    public Commands(ArrayList list){
        this.list = list;
    }
    
    public int getObservation(){
        return this.observation;
    }
    
    public ArrayList<Bird> getList(){
        return this.list;
    }
    
    public void add(String name, String latinName){
        Bird bird = new Bird(name,latinName,this.observation);
        list.add(bird);
    }
    
    public void observation(){
        this.observation++;
    }
    
    public void incrementObservation(String birdName){
        for (Bird bird : list) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                bird.setObs(1);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printOne(String birdName){
       /* int i = 0;
        order();
        System.out.println(list.get(i).getName() +"("+list.get(i).getLatinName()+"): "+list.get(i).getObservation()+" observations");*/
        for (Bird bird : list) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
                return;
            }
        }
        System.out.println("Not a bird!");
        
        
    }
    
    public void order(){
        int j = 0;
        for (int i = 1; i < this.list.size(); i++) {
            if(this.list.get(j).getObservation() > this.list.get(i).getObservation()){
                continue;
            }
            Collections.swap(list, i, j);
            
            if(this.list.get(j).getObservation() > this.list.get(i).getObservation()){
                j++;
            }
        }
    }
    
    public void printAll(){
        order();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() +"("+list.get(i).getLatinName()+"): "+list.get(i).getObservation()+" observations");
        }
    }
    
    
}
