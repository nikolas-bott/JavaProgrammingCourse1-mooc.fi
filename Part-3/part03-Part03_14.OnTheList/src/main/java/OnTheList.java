
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String name = scanner.nextLine();
        for (int i = 0; i < list.size()+1; i++) {
            if(i == list.size()){
                System.out.println(name+" was not found!");
                break;
            }
            if (name.equals(list.get(i))){
                System.out.println(name+" was found!");
                break;
            }
        }

    }
}
