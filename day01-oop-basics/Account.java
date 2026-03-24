import java.util.*;
public class Account {

   private String accountNumber;
    private double balance;
    // private List <Transaction> transactions = new ArrayList<>();

    public void deposit(double amount){
        if(amount> 0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if(balance<amount){
            throw new IllegalArgumentException("Insufficient balance");
        }
       
            balance-=amount;
        
    }
    public double getBalance(){
        return balance;
    }

}