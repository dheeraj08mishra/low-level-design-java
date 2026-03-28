public class CreditAccount extends Account {
    private double overdraftLimit;
    public CreditAccount(String accountNumber, double overdraftLimit){
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        validateAmount(amount);
        if(hasSufficientOverdraft(amount)){
           balance-=amount;
           transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        } else {
            throw new IllegalStateException("Insufficient balance and overdraft limit"); 
        }
    }


    private boolean hasSufficientOverdraft(double amount){
        return (balance + overdraftLimit) >= amount;
    }
    
}
