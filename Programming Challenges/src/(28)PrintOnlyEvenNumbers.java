import java.util.Scanner;

class PrintOnlyEvenNumbers {
    static void main(String[] args) {
        System.out.println("Welcome to Print Only Even Number\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" : ");
            newArray[i] = x.nextInt();
        }
        System.out.println("Even Numbers Are: ");
        for (int num : newArray){
            if (num%2!=0){
                continue;
            }
            System.out.print(num+" ");
        }
    }
}
