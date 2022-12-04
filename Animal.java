public abstract  class Animal {
    protected String name;
    protected int age;
    protected char gender;
    protected double price;
    public Animal(String name, int age, char gender, double price){
        this.age=age;
        this.name=name;
        this.gender = gender;
        this.price=price;
    }

    @Override
    public abstract String toString();
}
