
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        int ergebnis = number + number2;
        System.out.println(number +" + "+ number2 +" = "+ ergebnis);
    }
}
