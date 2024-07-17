
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String split[] = line.split(",");
                if(split[1].equals("1")){
                     System.out.println(split[0]+", age: "+split[1]+" year");
                }else{
                    System.out.println(split[0]+", age: "+split[1]+" years");
                }
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}
