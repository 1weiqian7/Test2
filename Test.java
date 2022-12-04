import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        double RemainingSum = 1000;
        ArrayList<Animal> AnimalList = new ArrayList<>();
        ArrayList<Customer> CustomerList = new ArrayList<>();
        Animal cat = new Cat("Kitty", 1, 'F', 200);
        Animal dog = new ChineseDog("Facai", 2, 'M', 100);
        Animal rabbit = new rabbit("Chelsea", 3, 'F', 500);
        AnimalList.add(cat);
        AnimalList.add(dog);
        AnimalList.add(rabbit);
        AnimalShop MyShop;
        MyShop = new MyAnimalShop(RemainingSum, AnimalList, CustomerList);
        MyShop.BuyNew(cat);
        Customer customer = new Customer();
        customer.name = "Joshua";
        customer.frequency = 17;
        customer.time = LocalDate.parse("2022-12-01");
        System.out.println(customer.toString());
        CustomerList.add(customer);
        MyShop.EntertainClients(customer);
        Customer customer1 = new Customer("CAN",23,LocalDate.parse("2022-11-15"));
        Customer customer2 = new Customer("S.COUPS",28,LocalDate.parse("2022-12-04"));
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        CustomerList.add(customer1);
        MyShop.EntertainClients(customer1);
        CustomerList.add(customer2);
        MyShop.EntertainClients(customer2);
        MyShop.close();
        /*Customer customer3 = new Customer("CAN",23,LocalDate.parse("2022-11-25"));
        CustomerList.add(customer3);
        System.out.println((AnimalList.get((AnimalList.size()-1))).name);
        AnimalList.remove(AnimalList.size()-1);
        MyShop.EntertainClients(customer3);*/
        Animal rabbit2 = new rabbit("Chelsea", 3, 'F', 50000);
        AnimalList.add(rabbit2);
        MyShop.BuyNew(rabbit2);




    }
}
