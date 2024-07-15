
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12,0};
        Main.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    /* public static boolean rightSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            
        }
        return true;
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] <= array[j]){
                    continue;
                }else{
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
            }
            
        }
    }
    
    public static void sort(String[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].length() <= array[j].length()){
                    continue;
                }else{
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
            }
            
        }
    }
    
    
    public static void sortIntegers(ArrayList<Integer> integers){
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i+1; j < integers.size(); j++) {
                if(integers.get(i) <= integers.get(j)){
                    continue;
                }else{
                    int temp = integers.get(i);
                    integers.set(i, integers.get(j));
                    integers.set(j, temp);
                }
                
            }
            
        } */
    
    
  /*  public static void sortStrings(ArrayList<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i+1; j < strings.size(); j++) {
                if(strings.get(i).length() <= strings.get(j).length()){
                    continue;
                }else{
                    String temp = strings.get(i);
                    strings.set(i, strings.get(j));
                    strings.set(j, temp);
                }
                
            }
            
        }
    }*/

}
/*int temp = 0;
        int i = 1;
        int safe;
        
        while(true) {
            if(){
                break;
            }
            if(array[temp] < array[i]){
                continue;
            }else{
                safe = array[temp];
                array[temp] = array[i];
                array[i] = safe;
                temp = i;
            }
            i++;
        }*/