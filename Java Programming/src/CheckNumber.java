import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Number Checker");
        System.out.println("Enter The Number:");
        int num= x.nextInt();

        if(num>0){
            System.out.println("Your Number Is Positive");
        }
        else if(num==0){
            System.out.println("Your Number Is Zero");
        }
        else{
            System.out.println("Your Number Is Negative");
        }

    }

}
