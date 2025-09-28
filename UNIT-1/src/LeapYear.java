import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Check Leap Year Or Not\n");
        System.out.println("Enter The Year:");
        int year = x.nextInt();

        if(year % 400 == 0 || (year % 100 !=0 && year % 4 == 0)){
            System.out.println("Your Year is a Leap Year");
            }
        else {
            System.out.println("Your Year Is Not a Leap Year");
        }
    }

}

