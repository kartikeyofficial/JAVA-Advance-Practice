import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Sum of Digits:");
        System.out.println("Enter The Number:");
        int num = x.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum Of Digits:"+sum);


    }
    public static  int sumOfDigits(int num){
        int sum =0;
        while(num>0){
            sum = sum + (num% 10);
            num /= 10;
        }
        return sum;
    }

}
