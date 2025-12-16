import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Number Checker");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = x.nextInt();
        boolean isPrime= isPrime(num);
        if(num<2){
            System.out.println("Your Number Is Not Prime");
        }
        else if (isPrime) {
            System.out.println("Your Number is Prime");
        }
        else{
            System.out.println("Your Number Is Not Prime");
        }

    }
    public static boolean isPrime(int num){
        int i=2;
        while(i< num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
