import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        ArrayList<Books> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            
            books.add(new Books(title,pages,year));
        }
        // book information and to examine them
        System.out.println("What information will be printed? - everything - name - pages - publication year");
        String info = scanner.nextLine();
        
        switch(info){
            case "everything": 
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).getTitle()+", "+books.get(i).getPages()+" pages, "+ books.get(i).getYear());
                }
                break;
            case "name":
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).getTitle());
                }
                break;
            case "pages":
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).getPages()+" pages.");
                }
                break;
            case "publication year":
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).getYear());
                }
                break;
        }
           
    }
}
