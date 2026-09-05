package Revision.Control_Statement;

import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        System.out.println("Welcome to Multiplication Table\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = x.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
