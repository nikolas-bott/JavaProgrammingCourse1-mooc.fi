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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList();
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        if(!(items.isEmpty())){
            for (int i = 0; i < items.size(); i++) {
                totalWeight += items.get(i).getWeight();
            }
        }
        return totalWeight;
    }
    public void addItem(Item item){
        int temp = item.getWeight();
        if(totalWeight()+temp <= maxWeight){
            items.add(item);
        }
    }
    
    public void printItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
    
    public String toString(){
        if(items.size()==0){
           return "no items (0 kg)";
        }
        if(items.size()==1){
           return items.size() + " item ("+totalWeight()+"kg)";
        }
        return items.size() + " items("+totalWeight()+"kg)";
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        int j = 1;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getWeight() > items.get(j).getWeight()){
                j++;
            }
        }
        return items.get(j);
    }
}
