import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to The Odd/Even Checker:\n");
        System.out.println("Enter The Number For Checking:");
        int num = x.nextInt();

        if(num%2==0){
            System.out.println("Your Number is Even");
        }
        else {
            System.out.println("Your Number Is Odd");
        }
    }
}
