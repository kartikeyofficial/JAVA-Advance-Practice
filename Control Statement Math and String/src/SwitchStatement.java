import java.util.Scanner;

public class SwitchStatement {
    static void main(String[] args) {
        System.out.println("Welcome to Switch Case-\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Day Number: ");
        int day = x.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }
    public static void oldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
    public  static void newSwitch(int day){
        String str = switch (day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Input!";

        };
        System.out.println(str);
    }
}
