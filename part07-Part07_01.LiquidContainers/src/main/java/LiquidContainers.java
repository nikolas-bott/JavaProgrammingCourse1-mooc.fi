
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        secondContainer second = new secondContainer();
        firstContainer first = new firstContainer(second);
        
        
        UserInterface user = new UserInterface(scan,first,second);
        user.start();
            
    }

}
