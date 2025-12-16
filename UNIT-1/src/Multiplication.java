import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to The Table-\n");
        System.out.println("Enter The Number Make The Table For You: ");
        int num= x.nextInt();
        PrintMultiplication(num);




    }
    public static  void PrintMultiplication(int num) {
   int i = 1;
   while(i<=10){
       System.out.println(num+" X "+i+" = "+(num*i));
       i++;
   }

    }
}
