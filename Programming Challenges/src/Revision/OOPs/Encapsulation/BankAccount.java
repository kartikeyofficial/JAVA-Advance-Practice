package Revision.OOPs.Encapsulation;

public class BankAccount {
        private  String accountNo;
        private  String accountHolderName;
        private  double balance;

    public BankAccount(String accountNo, String accountHolderName) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String toString() {
        return ("Account Balance is: "+balance);
    }

    public void depositMoney(double money){
            if (money<0){
                System.out.println("Invalid Deposit");
            }else {
                balance +=money;
            }

        }
        public double withdrawMoney(double money){
            if (money<=0){
                System.out.println("Invalid Withdraw");
            }else if(balance>=money) {
                balance -= money;

            }else {
                money = balance;
                balance = 0;
            }

            return money;
        }

}
