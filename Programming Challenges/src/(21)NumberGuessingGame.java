import java.util.Scanner;

class NumberGuessingGame {
    static void main(String[] args) {
        int num =5;
        int guess;
        Scanner x= new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game\n");
        do {
            System.out.println("Plaese guess the nUmber is Between 1-10: ");
             guess = x.nextInt();
        }while (num != guess);
        System.out.println("Successfully Guess the Correct Number");
    }
}
