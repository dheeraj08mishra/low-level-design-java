import java.util.*;
public class Account {

   private String accountNumber;
    private double balance;
    private List <Transaction> transactions = new ArrayList<>();

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
            throw new IllegalArgumentException("Insufficient balance");
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

    private void validateAmount(double amount){
        if(amount<= 0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

    private boolean hasSufficientBalance(double amount){
        return balance >= amount;
    }

    public void printMiniStatement(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("Transactions:");
        printTransactions();
    }

}