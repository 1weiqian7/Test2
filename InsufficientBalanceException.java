public class InsufficientBalanceException extends RuntimeException{
    public void InsufficientBalanceException(){
       System.out.println("余额不足，无法买入");
    }
}
