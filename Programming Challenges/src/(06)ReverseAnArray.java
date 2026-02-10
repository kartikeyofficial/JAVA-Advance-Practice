import java.util.Scanner;

class ReverseAnArray {
    static void main(String[] args) {
        System.out.println("Welcome To Reverse An Array\n");
        System.out.println("Enter The Array Limit:");
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();
        int[] numArray = new  int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" :");
            numArray[i] = x.nextInt();
        }
        reverse(numArray);
        System.out.println("Your Reverse Array Is: ");
        for (int i=0;i<numArray.length;i++){
            System.out.print(numArray[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr){
    for (int i=0;i<(arr.length/2);i++){
        int swap = arr[i];
        arr[i]= arr[(arr.length-1)-i];
        arr[(arr.length-1)-i]= swap;
    }
    }
}
