import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to The Left Shift Operator:\n");
        System.out.println("Enter The Number: ");
        int num = x.nextInt();

        int result = num<< 1;
        System.out.println("Left Shift of The Number Is: "+result);
    }
}
