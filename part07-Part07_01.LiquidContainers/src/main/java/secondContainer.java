/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class secondContainer {
    
    private int liquid;
    
    public secondContainer(){
        this.liquid = 0;
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
        if(this.liquid < a){
            this.liquid = 0;
        }
        if(a > 0 && this.liquid > a){
            this.liquid -= a;
        }
        
    }
    
}
