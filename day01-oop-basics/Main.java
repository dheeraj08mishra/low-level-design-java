

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Account account1 = new Account();
        account1.deposit(1000);
        account1.withdraw(200);
        System.out.println("Current Balance: " + account1.getBalance());
    }

    
}
