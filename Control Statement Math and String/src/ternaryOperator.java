import java.util.Scanner;

public class ternaryOperator {
    static void main(String[] args) {
        System.out.println("Welcome to Greatest Number\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2 = x.nextInt();
        int greaterNumber = num1>num2 ? num1:num2;
        System.out.println("Greatest Number is: "+greaterNumber);
    }
}
