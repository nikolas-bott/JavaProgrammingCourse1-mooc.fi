
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    

    //private PaymentCard person = new PaymentCard(1000); 

    
    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        if(payment-2.50 >= 0){
            affordableMeals++;
            money += 2.5  ;
            return payment - 2.50;
        }else{
            return payment;
        }
        
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
       
    }

    public double eatHeartily(double payment) {
        if(payment-4.30 >= 0) {
            heartyMeals++;
            money += 4.30;
            return payment - 4.30;
        }else{
            return payment;
        }
        
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 2.5){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }else{
            
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 4.30){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }else{
            
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            card.addMoney(sum);
            money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
