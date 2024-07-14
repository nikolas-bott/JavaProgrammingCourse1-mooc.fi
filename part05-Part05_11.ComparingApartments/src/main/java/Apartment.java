
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        
        if(this.squares > compared.squares){
            return true;
        }else{
            return false;
        }
            
    }
    
    public int priceDifference(Apartment compared){
        if((this.princePerSquare*this.squares) - (compared.princePerSquare*compared.squares) < 0){
            return (compared.princePerSquare*compared.squares) - (this.princePerSquare*this.squares);
        }else{
            return (this.princePerSquare*this.squares) - (compared.princePerSquare*compared.squares);
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare*this.squares > compared.princePerSquare*compared.squares){
            return true;
        }else{
            return false;
        }
    }

}
