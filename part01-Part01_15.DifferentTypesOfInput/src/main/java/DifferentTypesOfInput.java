
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        int integer = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double dou = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean boo = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string "+ string);
        System.out.println("You gave the integer "+integer);
        System.out.println("You gave the double "+ dou);
        System.out.println("You gave the boolean "+boo);
    }
}
