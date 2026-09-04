package Revision.Control_Statement;

import java.util.Scanner;

public class Recursion {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int num = x.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of The Number is: "+fact);
    }
    public static long factorial(int num){
         if (num==1){
            return 1;
         }
         return  num* factorial(num-1);
    }
}
