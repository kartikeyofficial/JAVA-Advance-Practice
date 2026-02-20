import java.util.Scanner;

class FibonacciSeries {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series using Recursion\n");
        System.out.println("Enter The Number:");
        int num = x.nextInt();
        for (int i=1;i<=num;i++){
            System.out.print(fibonacci(i)+" ");
        }

    }
    public static int fibonacci(int position){
        if (position==1){
            return 0;
        }
        if (position==2){
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);

    }
}
