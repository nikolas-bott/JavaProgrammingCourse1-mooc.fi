
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){ 
        Money newMoney = new Money(addition.euros+this.euros,addition.cents+this.cents);
        return newMoney;
    }
    
    public Money minus(Money decreaser){ 
       int euro = 0;
       int cent = 0;
        
       
       //größer - kleiner (euros)
       if(this.euros >= decreaser.euros){
           euro = this.euros - decreaser.euros;
           
           //größer - kleiner (cent)
           if(this.cents >= decreaser.cents){
              cent = this.cents - decreaser.cents;
           //kleiner - größer (Cent)
           }else if(this.cents < decreaser.cents){
               cent = 100-decreaser.cents;
               euro--;
           }
       } 
       
        Money newMoney =  new Money(euro, cent);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(compared.euros > this.euros){
            return true;
        }else{
            if(compared.euros == this.euros){
                if(compared.cents > this.cents){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
