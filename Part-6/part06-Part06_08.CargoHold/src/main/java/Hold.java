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

public class Hold {
    private int maxWeigth;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int max){
        this.maxWeigth = max;
        this.suitcases = new ArrayList();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int temp = suitcase.totalWeight();
 
        if(totalWeight()+temp <= maxWeigth){
        suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        if(suitcases.isEmpty()){
            return 0;
        }
        for (int i = 0; i < suitcases.size(); i++) {
            totalWeight += suitcases.get(i).totalWeight();
        }
        return totalWeight;
    }
    
    public void printItems(){
        for (int i = 0; i < suitcases.size(); i++) {
            suitcases.get(i).printItems();
        }
    }
    
    public String toString(){
        return suitcases.size() +" suitcases ("+ totalWeight()+" kg)";
    }
    
}
