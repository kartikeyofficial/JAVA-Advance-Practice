import java.util.Scanner;

class guessingGame {
    int random;
    guessingGame(){
        random = (int)Math.ceil(Math.random()*100);
    }
    int guess(int guessNumber){
       return guessNumber - random;
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        guessingGame gm = new guessingGame();
        System.out.println("Welcome to the Guessing Game, Guess the Number Between 1 to 100:\n");
        int guess;
        int result;
        do {
            System.out.println("Guess the Number:");
            guess = x.nextInt();
            result = gm.guess(guess);
            if (result==0){
                System.out.println("Congrats You Guess the Right Number");
            } else if (result<0) {
                System.out.println("Please Guess Higher");

            } else {
                System.out.println("Please Guess Lower");
            }
        }while (result !=0);

    }
}
