
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File?");
        String file = scanner.nextLine();
        System.out.println("Team?");
        String team = scanner.nextLine();
        
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
           ArrayList<String> list = new ArrayList<>();
           int counter = 0;
           int winCounter = 0;
           int lossCounter = 0;
            
           while(fileScanner.hasNext()){
               String line = fileScanner.nextLine();
               String[] split = line.split(","); //Teamname,Gegner,score,gegnerscore
               
               if(split[0].equals(team)||split[1].equals(team)){
                   counter++;
                   if(split[0].equals(team)){
                       if(Integer.parseInt(split[2]) > Integer.parseInt(split[3])){
                          winCounter++; 
                       }else{
                          lossCounter++; 
                       }
                   }
                   if(split[1].equals(team)){
                      if(Integer.parseInt(split[2]) < Integer.parseInt(split[3])){
                          winCounter++; 
                       }else{
                          lossCounter++; 
                       } 
                   }
               }
           }
           System.out.println("Games: "+counter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: "+lossCounter);
        }catch(Exception e){
            System.out.println("ERROR!!!");
        }
        
        

    }

}
