package Revision.Control_Statement;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int age;
        do {
            System.out.print("Enter Your Valid Age: ");
            age = x.nextInt();
        }while (age<0 || age>100);
        System.out.println("Your age is: "+age);
    }
}
