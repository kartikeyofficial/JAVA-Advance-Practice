import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Number-\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = x.nextInt();
        boolean isPalindrome= isPlindrome(num);
        if (isPalindrome){
            System.out.println("Your Number Is Plindrome Number");
        }
        else{
            System.out.println("Your Number Is Not a Palindrome Number");
        }
        System.out.println("Palindrome");
    }
     public static boolean isPlindrome(int num){
        return num == reverse(num);
     }
     public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit = num%10;
            newNum= newNum * 10+ digit;
            num /= 10;
        }
        return newNum;
     }
}
