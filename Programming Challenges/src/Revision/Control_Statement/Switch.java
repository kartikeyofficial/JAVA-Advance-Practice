package Revision.Control_Statement;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        System.out.println("Welcome to Switch Statement: ");
        System.out.print("Enter the Day Number: ");
        Scanner x = new Scanner(System.in);
        int day = x.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Monday");
                break;
            case 7:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}
