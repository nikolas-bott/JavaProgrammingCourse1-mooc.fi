/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance){
        if(balance < 150){
            this.balance = 150;
        }
        this.balance = balance;
    }
    public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }
    public void eatAffordably(){
        if(balance -2.60 >= 0){
             this.balance -= 2.60;
        }
       
    }
    public void eatHeartily(){
        if(balance -4.60 >= 0){
             this.balance -= 4.60;
        }
    }
    public void addMoney(double amount){
       
        if(amount > 0 && amount + balance < 150){
            this.balance += amount;
        }
        if(amount + balance > 150){
            this.balance = 150;
        }
    }
    
}
