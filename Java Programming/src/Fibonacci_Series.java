import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("welcome To  Fibonacci Series-\n");
        System.out.println("Enter The Number:");
        Scanner x = new Scanner(System.in);
        int n= x.nextInt();
        System.out.println("Here is The Fibonacci Series:");
        fibonacci(n);
    }
    public static void fibonacci(int n){
        if(n<0) return;
        System.out.print("0");
        if(n ==0) return;

        int num1= 0;
        int num2=1;
        while(num1+num2<= n){
            int next = num1 + num2;
            System.out.print(","+next);
            num1= num2;
            num2= next;

        }

    }
}
