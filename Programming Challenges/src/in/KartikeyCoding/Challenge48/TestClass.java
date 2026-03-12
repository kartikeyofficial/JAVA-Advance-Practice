package in.KartikeyCoding.Challenge48;

import java.util.Scanner;

public class TestClass {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome  to Division\n");
        System.out.print("Enter The First Number: ");
        int num1 = x.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = x.nextInt();

        TryCatchChallenge t1 = new TryCatchChallenge();

        t1.Division(num1,num2);
    }
}
