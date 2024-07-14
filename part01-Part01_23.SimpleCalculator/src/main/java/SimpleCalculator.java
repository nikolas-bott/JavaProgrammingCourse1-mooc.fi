
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        double geteiltErgebnis = (double)number / number2;
        int minusErgebnis = number - number2;
        int malErgebnis = number * number2;
        int plusErgebnis = number + number2;
        //System.out.println(number +" * "+ number2 +" = "+ ergebnis);
        System.out.println(number + " + " + number2 + " = " + plusErgebnis);
        System.out.println(number + " - " + number2 + " = " + minusErgebnis);
        System.out.println(number + " * " + number2 + " = " + malErgebnis);
        System.out.println(number + " / " + number2 + " = " + geteiltErgebnis);

    }
}
