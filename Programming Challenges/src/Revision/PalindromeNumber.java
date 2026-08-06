package Revision;

import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        System.out.println("Welcome to Palindrome Number\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = x.nextInt();
        boolean palindrome = isPalindrome(num);
        if(palindrome){
            System.out.println(num+" is Palindrome Number");
        }else {
            System.out.println(num+" is not Palindrome Number");
        }
    }
    public static boolean isPalindrome(int num){
        int original = num;
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum = sum*10+digit;
            num /=10;
        }
        if(original==sum){
            return true;
        }
        return false;
    }
}
