import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print("Enter The Name:");
        String name= x.nextLine();
        System.out.println("Good Morning "+name);
        System.out.print("Enter Your Age:");
        int age= x.nextInt();
        System.out.println("The Age Of "+name+" is "+age);

        System.out.println("Addition of two Numbers:");
        System.out.println("Enter The First Number:");
        int a= x.nextInt();
        System.out.println("Enter The Second Number:");
        int b=x.nextInt();
        int sum = a+b;
        System.out.println("Addition Of Two Numbers Are:"+sum);
    }
}
