
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first String:");
        String string1 = scan.nextLine();
        System.out.println("Enter the second String:");
        String string2 = scan.nextLine();
        if (string1.equals(string2)){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }
    }
}
