package Revision.Control_Statement;

import java.util.Scanner;

public class exitOnExit {
    static void main(String[] args) {
        System.out.println("\"exit\"Welcome to Exit on Exit\n");
        Scanner x = new Scanner(System.in);
        String str;
        do {
            System.out.print("Please Enter 'exit' for Exit into the loop: ");
            str = x.next();
        }while (str=="exit");
        System.out.println("you're Successful exit to the Loop");
    }
}
