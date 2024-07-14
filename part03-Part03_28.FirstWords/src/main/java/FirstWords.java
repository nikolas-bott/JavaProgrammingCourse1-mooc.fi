
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String satz = scanner.nextLine();

            if (satz.equals("")){
                break;
            }
            String[] pieces = satz.split(" ");

            System.out.println(pieces[0]);
        }


    }
}
