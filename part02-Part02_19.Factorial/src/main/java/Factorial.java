
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int number = Integer.parseInt(scanner.nextLine());
        int temp = 1;
        for (int i = 1; i <= number; i++){
            temp *= i;
        }
        System.out.println("The sum is "+temp);

    }
}
