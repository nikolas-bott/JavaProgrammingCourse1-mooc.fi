
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
      
        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(System.in);
        UserInterface user = new UserInterface(register,scanner);
      
        
        
        user.readPoints();
        user.printGradeDistribution();
        
       
    }
}
