
public class Book {

    private String name;
    private int publicationYear;
    private Book compBook;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object comp){
        if(this == comp){
            return true;
        }
        if (!(comp instanceof Book)) {
            return false;
        }
        
        compBook = (Book) comp;
        
        if(this.name.equals(compBook.getName()) && this.publicationYear == compBook.getPublicationYear()){
           return true; 
        }
        return false;
    }


}
