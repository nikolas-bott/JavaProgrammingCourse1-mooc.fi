import java.util.ArrayList;


public class Statistics {
    private int count = 0;
    private int sum;
    //private int[] numbers;
    //private ArrayList<Integer> list = new ArrayList<>();

    
    public Statistics(){
        int numberCount;
    }
    
    public void addNumber(int number){
        this.sum += number;
        count++;
    }
    
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return sum;
    }
    public double average(){
        if(count > 0 && sum > 0){
          return (double)sum/count;  
        }else{
            return 0;
        }
        
    }
}
