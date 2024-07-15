
import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(smallest < array[i]){
                continue;
            }else{
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[smallest] < array[i]){
                continue;
            }else{
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int smallest = startIndex;
        for (int i = startIndex+1; i < array.length; i++) {
            if(array[smallest] < array[i]){
                continue;
            }else{
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }
    
    public static void print(int[] array){
        System.out.print("(");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print(")");
    }
    
    public static void sort(int[] array){
        
        for (int i = 0; i < array.length; i++) {
            swap(array,indexOfSmallestFrom(array,i),i);
            print(array);
        }
    }

}
