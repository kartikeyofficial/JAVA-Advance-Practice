import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
        System.out.println("Welcome to Revering The Array:\n");
        System.out.print("Enter The Size Of Array:");
        int size = x.nextInt();
        int[] numArray = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter The Array elemnts "+(i+1)+": ");
            numArray[i] = x.nextInt();

        }
        reverse(numArray);
        System.out.println("Your Reversed Array is:");
        ArrayUtility.displayArray(numArray);

    }
    public static void reverse(int[] arr){
         for(int i=0; i<arr.length/2;i++){
            int swap =  arr[i];
            arr[i]= arr[(arr.length-1)-i];
             arr[(arr.length-1)-i]= swap;
         }
    }
}
