
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        
        if(month == 12 && day == 30){
            month = 1;
            year++;
            day = 1;
        }else{
        if(day == 30){
            month++;
            day = 1;
        }else{
            day++;
        }  
        }
        

    }
    
    public void advance(int days){
        for (int i = 0; i < days; i++) {
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate tempWIDB = new SimpleDate(this.day, this.month, this.year);
        tempWIDB.advance(days);       
        SimpleDate newDate = new SimpleDate(tempWIDB.day,tempWIDB.month,tempWIDB.year);
                
        return newDate;
    }

}
