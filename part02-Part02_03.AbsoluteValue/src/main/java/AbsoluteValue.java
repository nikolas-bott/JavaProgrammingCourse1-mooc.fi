
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        if(number1 < 0){
            System.out.println(number1*(-1));
        }else {
            System.out.println(number1);
        }

    }
}
