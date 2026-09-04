package Revision.Control_Statement;

import java.util.Scanner;

public class NumberGuess {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num=5;
        int guess;
        do {
            System.out.println("Please Guess the Number between 0 to 10: ");
            guess = x.nextInt();

        }while (num != guess);
        System.out.println("finally you Guess The Correct Number");
    }
}
