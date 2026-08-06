package Revision;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number-\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = x.nextInt();
        boolean armstrong = armstrong(num);
        if(armstrong){
            System.out.println(num+" is the Armstrong Number");
        }
        else {
            System.out.println(num+" is not Armstrong Number");
        }
    }
    public static boolean armstrong(int num){
           int sum =0;
           int originalNumber = num;
           while (num != 0){
               int digit = num%10;
               sum = sum+(digit*digit*digit);
               num=num/10;
           }
          if (sum==originalNumber){
              return true;
          }
          return false;
    }
}
