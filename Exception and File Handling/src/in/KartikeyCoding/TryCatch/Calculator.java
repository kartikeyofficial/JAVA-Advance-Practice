package in.KartikeyCoding.TryCatch;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.println("Enter The Two Numbers: ");
        int first = x.nextInt();
        int second = x.nextInt();
        try {
            int result = first/second;
            System.out.println("result is: "+result);
        }
//        catch (ArithmeticException exception){
//            System.out.println("Divide by Zero, Please Enter The Valid Value!");
//            System.out.printf("\n%s ,Enter the Valid Values! ",exception.getMessage());
//        }
        catch (Throwable th){
            System.out.println("Invalid Input! ");
            System.out.println(th.getStackTrace());
            throw  th;
        }

    }
}
