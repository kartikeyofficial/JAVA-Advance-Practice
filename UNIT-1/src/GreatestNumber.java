import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Greatest Number Of Three Numbers\n");
        System.out.println("Enter The First Number:");
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number:");
        int num2 = x.nextInt();
        System.out.println("Enter The Third NUmber:");
        int num3 = x.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1+" First Number Is Greater Than Given of Three Numbers");
        }
        else if(num2>=num1 && num2>=num1){
            System.out.println(num2+" Second Number Is Greater Than Given of Three Numbers");
        }
        else {
            System.out.println(num3+" Third Number Is Greater Than Given Of Three Numbers");
        }
    }
}
