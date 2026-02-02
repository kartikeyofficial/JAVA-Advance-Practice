import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Welcome to the Armstrong Number-\n");
        System.out.println("Enter The Number:");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();

        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println("Your Number is Arastrong Number");
        }
        else{
            System.out.println("Your Number is Not a Armstrong Number");
        }

    }
    public static  boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int finalNumber=0;
        while(num>0){
            int lastDigits= num %10;
            num /=10;
            finalNumber += pow(lastDigits,noOfDigits);
        }
        return false;
    }
    public static int pow(int num1 ,int num2){
        int result= num1;
        int i = 0;
        while(i<num2){
            result *= num1;
            i++;
        }
        return result;
    }
    public  static  int noOfDigits(int num){
        int digit= 0;
        while(num>0){
            digit++;
            num = num/10;
        }
        return digit;
    }
}
