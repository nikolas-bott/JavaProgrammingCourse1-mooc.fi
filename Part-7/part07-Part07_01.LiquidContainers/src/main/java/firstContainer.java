/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class firstContainer {
    
    private int liquid;
    private secondContainer second;
    
    public firstContainer(secondContainer second){
        this.liquid = 0;
        this.second = second;
    }
    
    public int getLiquid(){
        return this.liquid;
    }
    
    public void add(int a){
        if(a > 0){
            this.liquid += a;
        }
    }
    
    public void remove(int a){
        if(a > 0){
            this.liquid -= a;
        }
    }
    
    public void move(int amount){
        if(amount > 0){
            if(second.getLiquid() + amount > 100){
                remove(100-second.getLiquid());
                second.add(100-second.getLiquid());
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
}
