
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.parseInt(scanner.nextLine());
        int temp = 0;
        for (int i = 0; i <= number; i++){
            temp += i;
        }
        System.out.println("The sum is "+temp);

    }
}
