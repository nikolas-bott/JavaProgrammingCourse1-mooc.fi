
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i <= number1; i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
