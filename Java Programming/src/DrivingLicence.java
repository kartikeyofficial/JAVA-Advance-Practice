import java.util.Scanner;
public class DrivingLicence {
    public static void main(String[] args) {
        System.out.println("Welcome to Driving Licence Portal");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Your Age for Elligibility:");
        int age = x.nextInt();

        if(age>=18){
            System.out.println("You are Elligible to Drive");
        }
        else {
            System.out.println("Abhi Bachhe Cycle Chalao");
        }
    }
}
