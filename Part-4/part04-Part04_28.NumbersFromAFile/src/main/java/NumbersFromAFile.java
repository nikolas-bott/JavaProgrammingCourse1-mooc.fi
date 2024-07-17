
import java.nio.file.Paths;
import java.util.Scanner;


public class NumbersFromAFile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                int temp = Integer.parseInt(fileScanner.nextLine());
                
                if(temp >= lowerBound && temp <= upperBound){
                    counter++;
                }
            }
        }catch(Exception e){
            System.out.println("ERROR"+ e.getMessage());
        }
        System.out.println("Numbers: "+counter);

    }

}
/* if((Integer.parseInt(fileScanner.nextLine()) >= lowerBound) && (Integer.parseInt(fileScanner.nextLine()) <= upperBound)){
                    counter++;
                }*/