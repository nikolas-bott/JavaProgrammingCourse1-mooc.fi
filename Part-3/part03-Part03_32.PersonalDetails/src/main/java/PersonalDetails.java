
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int temp = 0;
        double counter = 0;
        String oldest = null;
        while(true){
            String satz = scanner.nextLine();

            if (satz.equals("")){
                break;
            }
            String[] pieces = satz.split(",");
            sum += Integer.parseInt(pieces[1]);
            counter++;

            if(pieces[0].length() > temp){
                oldest = pieces[0];
                temp = pieces[0].length();
            }
        }
        System.out.println("Longest name: "+ oldest);
        System.out.println("Average of the birth years: " + sum/counter);


    }
}
