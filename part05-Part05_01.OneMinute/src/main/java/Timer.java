/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Timer {
    private ClockHand seconds = new ClockHand(60);
    private ClockHand hSeconds = new ClockHand(100);
    
    public Timer(){
        
    }
    
    public void advance(){
        //while(hSeconds.value() >= 100){
        hSeconds.advance();
        
        if(hSeconds.value() == 99){
        seconds.advance();
        }
        
    }
    
    public String toString(){
        return seconds.toString() +":"+ hSeconds.toString();
    }
}
