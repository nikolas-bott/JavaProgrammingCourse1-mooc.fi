
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(elements.size() == 0){
            return "The collection "+ this.name +" is empty.";
        }else if(elements.size() == 1){
            return "The collection "+this.name +" has " +this.elements.size() + " element:\n" + this.elements.get(0);
        }else{
            String ele = this.elements.get(0)+"\n";
            String temp;
            for (int i = 1; i < this.elements.size(); i++) {
                temp = this.elements.get(i);
                ele += temp+"\n";
                
            }
            return "The collection "+this.name +" has " +this.elements.size() + " elements:\n" + ele;
        }
    }
    
}
