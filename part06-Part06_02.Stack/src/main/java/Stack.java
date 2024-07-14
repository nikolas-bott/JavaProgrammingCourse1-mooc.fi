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

public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList();
    }
    
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        return stack;
    }
    
    public String take(){
        String temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return temp;
    }
    
}
