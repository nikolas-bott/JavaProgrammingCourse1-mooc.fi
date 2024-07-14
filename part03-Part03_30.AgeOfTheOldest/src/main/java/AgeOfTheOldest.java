
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while(true){
            String satz = scanner.nextLine();

            if (satz.equals("")){
                break;
            }
            String[] pieces = satz.split(",");

            int temp = Integer.parseInt(pieces[1]);
            if(temp > max){
                max = temp;
            }
        }
        System.out.println("Age of the oldest: "+max);


    }
}
