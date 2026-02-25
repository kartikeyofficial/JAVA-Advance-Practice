package in.KartikeyCoding.Challenge39;

public class Customer {
    static void main(String[] args) {
        BankAccount account = new BankAccount("100280102300513","Mr. Kumar Kartikey");
        account.Deposit(100);
        System.out.println(account.withdrawMoney(200));
        account.Deposit(-40);
        System.out.println(account.withdrawMoney(0));
    }
}
