
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] arrayWords;

        while (true) {
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                //System.out.println("halted");
                break;
            }
            String[] pieces = userInput.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }

        }
    }
}
