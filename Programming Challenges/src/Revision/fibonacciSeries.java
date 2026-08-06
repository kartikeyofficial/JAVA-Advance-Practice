package Revision;

import java.util.Scanner;

public class fibonacciSeries {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("welcome to Fibonacci Series--\n");
        System.out.print("Enter The Number: ");
        int n = x.nextInt();
        fibonacci(n);

    }
    public static void fibonacci(int num){
        int first = 0;
        int second = 1;
        if(num<0){
           return;
        }
        System.out.print("0 ");
        if (num==0){
            System.out.print("1 ");
        }
        while (first+second<=num){
        int third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}
