package Revision.Control_Statement;

import java.util.Scanner;

public class fibonacciSeries {
    static void main(String[] args) {
        System.out.println("Welcome to Fibonacci series \n");
        System.out.print("Enter the Range of the Series: ");
        Scanner x = new Scanner(System.in);
        int count  = x.nextInt();
        for (int i=1;i<=count;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int position){
        if (position==1){
            return 0;
        }
        if (position==2){
            return 1;
        }
        return (fibonacci(position-1)+fibonacci(position-2));
    }
}
