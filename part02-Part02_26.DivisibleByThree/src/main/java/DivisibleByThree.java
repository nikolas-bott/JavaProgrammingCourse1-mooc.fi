
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(1,10);


    }
    public static void divisibleByThreeInRange(int number, int number2){
        for (int i = number; i <= number2; i++) {
            if (i%3==0){
                System.out.println(i);
                continue;
            }
        }
    }
}
