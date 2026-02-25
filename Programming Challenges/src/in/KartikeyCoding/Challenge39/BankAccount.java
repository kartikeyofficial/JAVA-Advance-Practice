package in.KartikeyCoding.Challenge39;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
          this.accountNumber = accountNumber;
          this.accountHolderName = accountHolderName;
    }

    public void Deposit(double money) {
        if (money < 0) {
            System.out.println("Invalid Amount!");
        } else {
            balance += money;
        }

    }

    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdraw");

        }
        else if (money <= balance) {
            balance -= money;
        }else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
