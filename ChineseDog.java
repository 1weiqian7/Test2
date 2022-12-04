public class ChineseDog extends Animal {
    protected boolean Vaccinelnjected;
    public boolean isVaccinelnjected(boolean Vaccinelnjected){
       return Vaccinelnjected;
    }
    public ChineseDog(String name, int age, char gender, double price) {
        super(name, age, gender, price);
        price = 100;
    }


    @Override
    public String toString() {
        String details = "name "+name;
        details+="\n age "+ age;
        details+="\n gender "+gender;
        details+="\n price "+price;
        return details;
    }
}
