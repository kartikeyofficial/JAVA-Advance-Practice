import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To the Factorial");
        System.out.println("Enter The Number:");
        int num = x.nextInt();
        long fact= factorial(num);
        System.out.println("Factorial is: "+fact );
    }
    public static long factorial(int num){
        if(num<2){
            return 1;

        }
        long fact = 1;
        int i=1;
        while(i<=num){
            fact *=i;
            i++;
        }
        return fact;

    }
}
