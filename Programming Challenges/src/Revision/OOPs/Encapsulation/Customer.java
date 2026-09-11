package Revision.OOPs.Encapsulation;

public class Customer {
    static void main(String[] args) {
        BankAccount account = new BankAccount("00001","Kumar Kartikey");
        account.depositMoney(100);
        System.out.println(account);
        account.withdrawMoney(50);
        System.out.println(account);
        account.depositMoney(-10000);


    }


}
