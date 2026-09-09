package Revision.ToString;

import java.util.Scanner;

public class gueseingGame {
    int random;
    gueseingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }
    int guess(int guessNumber){
        return guessNumber-random;
    }

    static void main(String[] args) {
        System.out.println("Guessing Game\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Guess the Number: ");
        gueseingGame game = new gueseingGame();
        int guess;
        int result;
        do {
            System.out.print("Guess the Number: ");
            guess =  x.nextInt();
            result = game.guess(guess);
            if(result==0){
                System.out.println("Your Guess is Correct");
            }
            else if(result<0){
                System.out.println("Please Guess Higher");
            }else {
                System.out.println("Please Guess Lower");
            }

        }while (result!=0);
    }
}
