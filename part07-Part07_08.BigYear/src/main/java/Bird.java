/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name,String latinName,int observation){
        this.name = name;
        this.latinName = latinName;
        this.observation = observation;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    public int getObservation(){
        return this.observation;
    }
    
    public void setObs(int obs){
        this.observation += obs;
    }
    
    public String toString(){
        return this.name +", "+ this.latinName;
    }
    
}
