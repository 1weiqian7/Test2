import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

 public class MyAnimalShop implements AnimalShop {
    protected double RemainingSum;
    protected double profit;
    Customer customer = new Customer();
    ArrayList<Animal> AnimalList = new ArrayList<>();
    ArrayList<Customer> CustomerList = new ArrayList<>();
    public MyAnimalShop(double RemainingSum, ArrayList<Animal> AnimalList, ArrayList<Customer> CustomerList){
        this.RemainingSum = RemainingSum;
        this.AnimalList = AnimalList;
        this.CustomerList =CustomerList;
    }
    @Override
    public void close(){
        DayOfWeek dow = LocalDate.parse("2022-12-04").getDayOfWeek();
        Customer customer1 = CustomerList.get(CustomerList.size()-1);
        if(customer1.time.getDayOfWeek()==dow){
            System.out.println("The shop is close");
            for(int i=0;i< CustomerList.size();i++){
                CustomerList.get(i).toString();
            }
            System.out.println(profit);
        }
    }
    @Override
   public  void EntertainClients(Customer customer) throws AnimalNotFoundException {
        CustomerList.add(customer);
        if(AnimalList.size()==0){
            throw new AnimalNotFoundException();
        }else{
            Animal sell = AnimalList.get(AnimalList.size()-1);
            sell.toString();
            RemainingSum = RemainingSum + sell.price;
            //设定每种动物的价格都比成本贵百分之五十；
            profit = profit+(sell.price-(sell.price/1.5));
            AnimalList.remove(AnimalList.size()-1);
        }

    }
    @Override
     public void BuyNew(Animal animal) throws InsufficientBalanceException{
        AnimalList.add(animal);
        if((RemainingSum - animal.price)<0){
            throw new InsufficientBalanceException();
        }else{
            RemainingSum=RemainingSum - animal.price;
        }

    }

}
