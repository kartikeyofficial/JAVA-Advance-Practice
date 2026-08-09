package Revision.Array;

import java.util.Scanner;

public class MaxMinArray {
    static void main(String[] args) {
        System.out.println("Welcome to Min & Max Array\n");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Max Integer in all Over Array is: "+max);
        System.out.println("Min Integer in all Over Array is: "+min);

    }
    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<numArr.length;i++){
           if (min>numArr[i]){
               min = numArr[i];
           }

        }
        return min;

    }
    public static int max(int[] numArr){
        if (numArr.length==0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        for (int i=1;i<numArr.length;i++){
            if(max<numArr[i]){
                max = numArr[i];
            }
        }
        return max;
    }
}
