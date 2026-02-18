import java.util.Scanner;

class monthSwitch {
    static void main(String[] args) {
        System.out.println("Welcome to month Finder:\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Month Number: ");
        int monthNum = x.nextInt();
        String monthName = getMonth(monthNum);
        System.out.println("Your Month Name is: "+monthName);
    }
    public static String getMonth(int monthNum){
        return switch (monthNum){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Input";
        };

    }
}
