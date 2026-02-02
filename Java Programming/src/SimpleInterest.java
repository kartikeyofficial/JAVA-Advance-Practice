import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to the Simple Interest Calculator\n");
        System.out.println("Enter The Principle amount in RS:");
        int p = x.nextInt();
        System.out.println("Enter The Rate Of Interest");
        float r = x.nextFloat();
        System.out.println("Now, tell me How Many Years Are you Borrow:");
        float t = x.nextFloat();

        float interest= (p*r*t)/100;

        System.out.println("Give, Me To my Simple Interest Amount :"+interest+" RS");


    }

}
