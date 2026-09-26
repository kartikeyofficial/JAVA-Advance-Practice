package Revision.FileHandling.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExce{
    static void main(String[] args) throws ArithmeticException {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        double num1 = x.nextDouble();
        System.out.print("Enter The Second Number: ");
        double num2 = x.nextDouble();
        double result = num1/num2;
        System.out.println("The Result is: "+result);
    }
}
