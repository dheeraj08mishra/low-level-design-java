import java.util.*;
public class Account {

   private String accountNumber;
    protected double balance;
    protected List <Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
   
    

    public void deposit(double amount){
        validateAmount(amount);
         balance+=amount;
         transactions.add(new Transaction( TransactionType.DEPOSIT, amount));
    }
    public void withdraw(double amount){
        validateAmount(amount);

        if(hasSufficientBalance(amount)){
            balance-=amount;
            transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        } else {
            throw new IllegalStateException("Insufficient balance");
        }
        
    }
    public void printBalance() {
        System.out.println("Balance: " + balance);
    }
    public void printTransactions(){
        for(Transaction transaction : transactions){
            System.out.println(transaction.getType() + " - " + transaction.getAmount());
        }
    }

    protected void validateAmount(double amount){
        if(amount<= 0){
            throw new IllegalStateException("Amount must be greater than zero");
        }
    }

    protected boolean hasSufficientBalance(double amount){
        return balance >= amount;
    }

    public void printMiniStatement(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("Transactions:");
        printTransactions();
    }

    public double getBalance() {
        return balance;
    }

}