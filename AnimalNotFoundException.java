import java.util.ArrayList;

public class AnimalNotFoundException extends RuntimeException
{

    ArrayList<Customer> list = new ArrayList<>();
  public AnimalNotFoundException(){

      System.out.println("宠物店没有宠物了！！Sorry");
  }

}

