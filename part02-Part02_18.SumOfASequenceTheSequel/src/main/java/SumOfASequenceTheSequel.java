
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int number1 = Integer.parseInt(scanner.nextLine());
        int temp = 0;
        for (int i = number; i <= number1; i++){
            temp += i;
        }
        System.out.println("The sum is "+temp);

    }
}
