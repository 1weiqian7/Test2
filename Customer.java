import java.time.LocalDate;

public class Customer {
    protected String name;
    protected int frequency;
    protected LocalDate time;
    public Customer (){}
    public Customer(String name,int frequency,LocalDate time){
        this.name=name;
        this.time=time;
        this.frequency=frequency;
    }
    @Override
    public  String toString(){
        String details = "name "+name;
        details+="\nfrequency "+ frequency;
        details+="\ntime "+time;
        return details;
    }


}
