
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Shall we carry on?");
            String test = scanner.nextLine();
            if (test.equals("no")){
                break;
            }
        }

    }
}
