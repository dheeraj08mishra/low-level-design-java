public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public void withdraw(double amount) {
        validateAmount(amount);
        if (hasSufficientBalance(amount)) {
            balance -= amount;
            transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        } else {
            throw new IllegalStateException("Insufficient balance");
        }
    }

}
