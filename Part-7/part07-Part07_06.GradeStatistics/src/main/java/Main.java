
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        
        UserInterface user = new UserInterface(list, scanner);
        
        user.start();
            
    }
}
