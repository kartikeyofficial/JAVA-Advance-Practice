package Revision.Control_Statement;

import java.util.Scanner;

public class MinimumTernary {
    static void main(String[] args) {
        System.out.println("Welcome to finding Minimums\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = x.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = x.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.Min(num1,num2);
        System.out.println("Minimum Number is: "+min);

    }
    public int Min(int num1, int num2){
        return num1<num2 ? num1:num2;
    }
}
