
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container second = new Container();
        Container first = new Container();
        
        
        UserInterface user = new UserInterface(scan,first,second);
        user.start();
    }

}
