import java.util.Scanner;

public class Recursion {
    static void main(String[] args) {
        System.out.println("Welcome to Factorial\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int num = x.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of your Number is: "+fact);
    }
    public static long factorial(int num){
        if (num==1){
            return 1;
        }
        return num*factorial(num-1);

    }
}
