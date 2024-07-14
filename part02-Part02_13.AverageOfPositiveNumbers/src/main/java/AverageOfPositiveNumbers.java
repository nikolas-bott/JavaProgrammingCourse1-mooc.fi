
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double counter = 0;
        while(true) {
            System.out.println("Give a number:");
            double number = Double.parseDouble(scanner.nextLine());
            if (number == 0 && !(sum == 0)){
                System.out.println("Average of the numbers: "+sum / counter);
                break;
            }
            if (number < 0){
                continue;
            }
            sum += number;
            counter++;
            if(sum == 0){
                System.out.println("Cannot calculate the average");
                break;
            }
        }

    }
}
