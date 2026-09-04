package Revision.Control_Statement;

import java.util.Scanner;

public class passwordchecker {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please Enter Your Password: ");
            password = x.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks For Enter Valid Password");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;


    }
}
