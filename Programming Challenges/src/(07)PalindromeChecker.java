import java.util.Scanner;

class PalindromeChecker {
    static void main(String[] args) {
        System.out.println("Welcome To Palindrome Checker!\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size of the Array: ");
        int size = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" is: ");
            newArray[i] = x.nextInt();
        }
        boolean isplaindrome = isPalindrome(newArray);
        if(isplaindrome){
            System.out.println("Your Array Is Palindrome");
        }
        else {
            System.out.println("Your Array is Not Palindrome:");
        }


    }
    public static boolean isPalindrome(int[] newArray){
        for (int i=0;i<newArray.length;i++){
            if(newArray[i] !=newArray[newArray.length - 1 -i]){  // most important formula for palindrome
                  return false;
            }
        }
        return true;
    }
}
