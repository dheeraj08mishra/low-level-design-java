
import java.util.*;
public class Transaction {

   private String transactionId;
    private double amount;
    private TransactionType type;

   public Transaction(TransactionType type, double amount){
    this.transactionId = UUID.randomUUID().toString();
    this.type = type;
    this.amount = amount;
   }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }
    
}