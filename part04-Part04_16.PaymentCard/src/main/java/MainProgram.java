
public class MainProgram {

     public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: "+paulsCard.toString());
        System.out.println("Matt: "+mattsCard.toString());
        
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: "+paulsCard.toString());
        System.out.println("Matt: "+mattsCard.toString());
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: "+paulsCard.toString());
        System.out.println("Matt: "+mattsCard.toString());
        
        


        // write code here
    }
}
