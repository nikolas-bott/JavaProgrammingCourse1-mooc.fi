
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
    
    public String longest(){
        
        if(elements.isEmpty()){
            return null;
        }
        String temp = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if(elements.get(i).length() > temp.length()){
                temp = elements.get(i);
            }
        } 
        return temp;
    }

}
