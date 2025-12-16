import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcomr to Odd Sum-\n");
        System.out.println("Please Enter Your Number: ");
        int num = x.nextInt();
        int sum = oddSum(num);
        System.out.println("The Sum Of Odd Numbers between 0 to "+ num+" : " +sum);
    }

    public static  int oddSum(int num){
        int i = 1;
        int sum= 0;
        while(i<=num){
            sum += i;
            i += 2;
        }
        return sum;

    }
}
