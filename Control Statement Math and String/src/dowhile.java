import java.util.Scanner;

public class dowhile {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please Enter Your age: ");
        int age = x.nextInt();
        do{
            System.out.println("Please enter Your valid Age:");
            age = x.nextInt();

        }while (age<0 || age>100);
        System.out.println("Your Age is: "+age);
    }
}
