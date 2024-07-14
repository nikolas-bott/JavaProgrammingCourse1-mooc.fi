
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String oldest = null;
        while(true){
            String satz = scanner.nextLine();

            if (satz.equals("")){
                break;
            }
            String[] pieces = satz.split(",");

            int temp = Integer.parseInt(pieces[1]);
            if(temp > max){
                max = temp;
                oldest = pieces[0];
            }
        }
        System.out.println("Name of the oldest: "+ oldest);


    }
}
