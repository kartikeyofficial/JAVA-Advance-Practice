import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Compliment Operator");
        System.out.println("Enter Your Number:");
        int num = x.nextInt();

        int result = ~num;

        System.out.println("Bitwise Compliment Operator: "+result);
    }
}
