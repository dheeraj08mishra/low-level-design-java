

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Account account1 = new Account( "123456789");
        account1.deposit(1000);
          account1.deposit(100);
            account1.deposit(10000);
            account1.withdraw(500);
             account1.withdraw(200);
            account1.printMiniStatement();
    }

    
}
