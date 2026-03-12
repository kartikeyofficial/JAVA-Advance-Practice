package in.KartikeyCoding.Finally;

import java.util.Scanner;

public class Finally {
    public static void division(int a , int b){
        try{
            System.out.println("Division of Two Numbers is: "+(a/b));
        }
        catch (ArithmeticException ae){
            System.out.println("Because of divide by Zero");
        }
        finally {
            System.out.println("Invalid Input");
        }
    }

    static void main(String[] args) {
        Scanner  x= new Scanner(System.in);
        System.out.println("Enter the Two Numbers: ");
        int num1 = x.nextInt();
        int num2 = x.nextInt();
        division(num1,num2);
    }
}
