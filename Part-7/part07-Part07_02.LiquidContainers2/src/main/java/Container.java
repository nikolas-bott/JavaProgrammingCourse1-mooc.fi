/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Container {
    
    private int liquid;
    //private Container first;
    //private Container second;
    
    public Container(){
        this.liquid = 0;
    }
    
    public int contains(){
        return this.liquid;
    }
    
    public void add(int amount){
        if(amount > 0 ){
            if(amount + this.liquid > 100){
                this.liquid = 100;
            }else{
                this.liquid += amount;
            }
        }
    }
    
    public void remove(int amount){
        if(amount > 0){
            if(this.liquid - amount < 0){
                this.liquid = 0;
            }else{
                this.liquid -= amount;
            }
        }
    }
     
   public void move(int amount, Container second){
       if(amount > 0){
            if(second.contains() + amount > 100){
                remove(100-second.contains());
                second.add(100-second.contains());
            }else{
                if(this.liquid < amount){
                //System.out.println("ja");
                second.add(this.liquid);
                remove(this.liquid);
                }else{
                    //System.out.println("ja2");
                  remove(amount);
                  second.add(amount);  
                }
            }
             
        }
   }
    
    public String toString(){
        return  this.liquid+"/100";
    }
    
    
    
}
