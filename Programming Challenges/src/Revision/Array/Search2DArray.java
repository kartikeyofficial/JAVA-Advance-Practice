package Revision.Array;

import java.util.Scanner;

public class Search2DArray {
    static void main(String[] args) {
        System.out.println("Welcome to 2D Array: \n");
        int[][] numArr = ArrayUtility.input2DArray();
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Element to be Search: ");
        int num = x.nextInt();
        boolean isFound = search(numArr,num);
        if (isFound){
            System.out.println("Element is in this Array");
        }
        else {
            System.out.println("Element is not Found in this Array");
        }

    }
    public static boolean search(int[][] numArray, int num){
        for (int i=0;i<numArray.length;i++){
           for (int j=0;j<numArray.length;j++){
               if (numArray[i][j]==num){
                   return true;
               }
           }
        }
        return false;
    }
}
