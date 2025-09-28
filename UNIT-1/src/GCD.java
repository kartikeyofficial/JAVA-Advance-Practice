import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Welcome to GCD");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2 = x.nextInt();
        int gcd = gcd(num1,num2);
            System.out.println("GCD of the nUmber is: "+gcd);

    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while(i<=least){
            if(num1 % i==0 && num2 % i==0){
                gcd= i;
            }
            i++;
        }

        return gcd;
    }
    public static int least(int num1, int num2){
        if (num1< num2){
            return num1;
        }
        else{
            return num2;
        }
    }

}
