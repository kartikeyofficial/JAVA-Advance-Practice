import java.util.Scanner;

class AbsoluteValue {
    static void main(String[] args) {
        System.out.println("Welcome to Absolute Value\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Value: ");
        int num = x.nextInt();
        int absolute = num>=0? num:-num;
        System.out.println("Your Absolte Value is: "+absolute);
    }
}
