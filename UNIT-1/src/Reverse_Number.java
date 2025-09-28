import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Welcome To The Reverse Number-\n");
        System.out.println("Enter The Number:");
        Scanner x= new Scanner(System.in);
        int num= x.nextInt();

        int reverse = reverse(num);
        System.out.println("Reverse Of Your Number is: "+reverse);
    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit= num%10;
            newNum = newNum * 10 + digit;
            num = num/10;
        }
        return newNum;
    }
}
