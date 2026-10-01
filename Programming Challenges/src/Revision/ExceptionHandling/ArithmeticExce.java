package Revision.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExce{
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        try {
            System.out.print("Enter The First Number: ");
            double num1 = x.nextDouble();
            System.out.print("Enter The Second Number: ");
            double num2 = x.nextDouble();
            double result = num1/num2;
            System.out.println("The Result is: "+result);
        }
        catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Because of Divide by Zero");
            }else {
                throw exception;
            }
        }
        catch (InputMismatchException im){
            System.out.println("Input mismatch! exception give Correct Data Type!");
        }

    }
}
