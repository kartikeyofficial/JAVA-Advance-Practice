package Revision;

import java.util.Scanner;

public class ReversedTheNumber {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to reverse Number--");
        System.out.print("Enter The Number: ");
        int num = x.nextInt();
        System.out.println("Reversed Number is: "+reverse(num));

    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit = num%10;
            newNum =newNum*10+digit;
            num = num/10;
        }
        return newNum;
    }
}
