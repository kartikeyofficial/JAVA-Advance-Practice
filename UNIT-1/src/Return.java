import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second= readNumber();
        int sum = first+second;
        System.out.println("Addition of Two Numbers Are: "+sum);

    }

    public static void greet() {
        System.out.println("welcome to the Calculator-\n");
    }
    public static int readNumber(){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The NUmber:");
        int number= x.nextInt();
        return number;
    }

}