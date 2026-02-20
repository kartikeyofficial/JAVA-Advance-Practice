import java.util.Scanner;

class PalindromeRecursion {
    static void main(String[] args) {
        System.out.println("Welcome to Palindrome \n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str = x.nextLine();
        System.out.println("Your String is "+(isPalindrome(str)?"Palindrome":"Not Palindrome"));

    }
    public static boolean isPalindrome(String str){
        if (str.length()<=1){
            return true;
        }
        int lastPosition = str.length()-1;
        if (str.charAt(0)!=str.charAt(lastPosition)){
            return false;
        }
        String newStr = str.substring(1,lastPosition);
        return isPalindrome(newStr);
    }
}
