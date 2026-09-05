package Revision.Control_Statement;

import java.util.Scanner;

public class PrimeOrNot {
    static void main(String[] args) {
        System.out.println("Welcome to Prime or Not\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int  num = x.nextInt();
        boolean isPrime = prime(num);
        if (isPrime){
            System.out.println(num+" is a Prime Number");
        }else {
            System.out.println(num+" is Not a Prime Number");
        }

    }
    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
