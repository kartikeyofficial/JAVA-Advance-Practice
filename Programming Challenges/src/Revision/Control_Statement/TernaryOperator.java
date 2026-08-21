package Revision.Control_Statement;

import java.util.Scanner;

public class TernaryOperator {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = x.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = x.nextInt();
        int greaterNumber = num1>num2?num1:num2;
        System.out.println(greaterNumber);


    }

}
