
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0){
                System.out.println("Number of numbers: " + counter);
                System.out.println("Sum of the numbers: "+sum);
                break;
            }
            sum += number;
            counter++;
        }

    }
}
