package Revision.Array;

import java.util.Scanner;

public class ArraySumAverage {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Array Sum and Average");
        System.out.print("Please Enter The Size of the Array is: ");
        int size = x.nextInt();

        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Please Enter Element no. "+(i+1)+": ");
            arr[i] = x.nextInt();
        }
        long sum = sum(arr);
        float avg = avg(arr);
        System.out.println("Sum of the array is: "+sum);
        System.out.println("Average of the Array is: "+avg);

    }

    public static long sum(int[] arr) {
        long sum =0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static float avg(int[] arr){
         long sum = sum(arr);
         return (float)(sum/arr.length) ;
    }
}
