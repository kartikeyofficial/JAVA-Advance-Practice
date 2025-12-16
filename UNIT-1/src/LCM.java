import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Enter The First Number:");
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2= x.nextInt();
        int lcm =lcm(num1,num2);
        System.out.println("The LCM Of Numbers Is: "+ lcm);
    }
    public static  int lcm(int num1, int num2){
        int i=1;
        while(true){
                int factor= num1*i;
                if( factor % num2 == 0){
                    return  factor;
                }
                i++;
        }
    }
}
