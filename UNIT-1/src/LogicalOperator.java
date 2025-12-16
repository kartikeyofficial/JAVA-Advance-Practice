import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Discount Calculator");
        Scanner x = new Scanner(System.in);
        System.out.println("Please Enter Your Age:");
        int age = x.nextInt();
        System.out.println("Are You Female? (true/false):");
        boolean is_female= x.nextBoolean();

        if (age<5){
            System.out.println("You Got 75% Discount");
        }
        else if(is_female) {
            System.out.println("You Got 50% Discount");
        }
        else if(age > 60 && !is_female){
            System.out.println("You Got 25% Discount");
        }else {
            System.out.println("You got No Discount");
        }

    }
}
