
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    Account account1 = new Account("123456789");
    account1.deposit(1000);
    account1.deposit(100);
    account1.deposit(10000);
    account1.withdraw(500);
    account1.withdraw(200);
    account1.printMiniStatement();

    SavingsAccount savingAccount1 = new SavingsAccount("987654321", 5.0);
    savingAccount1.deposit(10000);
    savingAccount1.applyInterest();
    savingAccount1.printMiniStatement();

    CreditAccount creditAccount1 = new CreditAccount("555555555", 2000);
    creditAccount1.deposit(500);
    creditAccount1.withdraw(600);
    creditAccount1.withdraw(1500);
    creditAccount1.withdraw(400);
    creditAccount1.printMiniStatement();

    Account acc = new SavingsAccount("123", 5.0);
    acc.deposit(1000);

    acc.printMiniStatement();
  }

}
