/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Books {
    private String title;
    private int pages;
    private int year;
    public Books(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYear(){
        return this.year;
    }
       
}
