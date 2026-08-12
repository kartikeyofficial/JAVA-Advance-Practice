package Revision.Array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner x = new Scanner(System.in);

        System.out.print("Please Enter The Size of the Array is: ");
        int size = x.nextInt();

        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Please Enter Element no. "+(i+1)+": ");
            arr[i] = x.nextInt();
        }
        return  arr;
    }
    public static void displayArray(int[] nums){
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static int[][] input2DArray(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Size of Rows: ");
        int rows = x.nextInt();
        System.out.print("Enter the Size of Columns: ");
        int cols = x.nextInt();
        int[][] numArr = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Enter the Array Elements ("+(i+1)+","+(j+1)+"): ");
                numArr[i][j] = x.nextInt();
            }
        }
        return numArr;
    }
}
