import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Bitwise XOR Operator\n");
        System.out.println("Enter The First Number:");
        int num1 = x.nextInt();
        System.out.println("Enter The Other Number:");
        int num2 = x.nextInt();

        int result = num1 ^ num2;

        System.out.println("Bitwise XOR Result: "+result);
    }
}

