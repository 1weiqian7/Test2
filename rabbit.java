public class rabbit extends Animal {
    public rabbit(String name, int age, char gender, double price) {
        super(name, age, gender, price);
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
