/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String name, int rating){
        this.name = name;
        this.ageRating = rating;
    }
    
    public String name(){
        return this.name;
    }
    public int ageRating(){
        return this.ageRating;
    }
    
}
