package Revision.FileHandling.ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = x.nextDouble();
        System.out.print("Enter the Second Number: ");
        double num2 = x.nextDouble();
        try {
//            int[] a= new int[5];
//            System.out.println("Result is: "+a[6]);
            double result = num1/ num2;
            System.out.println("Result is: "+result);

        }catch (ArithmeticException ie){
            System.out.println(ie.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }

    }
}
