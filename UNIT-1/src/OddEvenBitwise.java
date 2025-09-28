import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Checking\n");
        System.out.println("Enter The Number: ");
        int num = x.nextInt();

        if((num & 1) ==1){
            System.out.println(num+" Is an Odd Number");
        }
        else {
            System.out.println(num+" Is an Even Number");
        }

    }
}
