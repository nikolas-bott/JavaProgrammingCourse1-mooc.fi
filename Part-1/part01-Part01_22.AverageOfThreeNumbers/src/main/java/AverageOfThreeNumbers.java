
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int number3 = Integer.valueOf(scanner.nextLine());
        double ergebnis = (double) (number + number2 + number3) /3;
        //System.out.println(number +" * "+ number2 +" = "+ ergebnis);
        System.out.println("The average is " + ergebnis);

    }
}
