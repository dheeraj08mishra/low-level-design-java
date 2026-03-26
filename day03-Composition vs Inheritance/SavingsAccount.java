public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
    
}
