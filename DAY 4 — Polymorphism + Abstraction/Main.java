import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    List<Account> accounts = new ArrayList<>();
    accounts.add(new SavingsAccount("SA123", 5.0));
    accounts.add(new CreditAccount("CA123", 1000.0));

    for (Account account : accounts) {
      account.deposit(500);
      account.printBalance();
      account.withdraw(200);
      account.printBalance();
      System.out.println("Mini Statement:");
      account.printMiniStatement();
      System.out.println("-------------------");
    }
  }

}
