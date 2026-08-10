package Revision.Array;

import java.util.Scanner;

public class DeleteFromArray {
    static void main(String[] args) {
        System.out.println("Welcome to Deletion of the Array!\n");
        Scanner x = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the Element You Want to Delete From Array: ");
        int num = x.nextInt();
        int[] newArr = deleteArray(numArr,num);
        System.out.println("There is your new Array: ");
        ArrayUtility.displayArray(newArr);

    }
    public static int[] deleteArray(int[] numArr, int num){
         int occ = OccurrencesArray.noOfOccurrences(numArr,num);
         if (occ==0){
             return numArr;
         }
         int newSize = numArr.length-occ;
         int[] newArr = new int[newSize];
         int i=0, j=0;
         while (i<numArr.length){
             if(numArr[i] !=num){
                 numArr[j] = numArr[i];
                 j++;
             }
             i++;
         }
         return newArr;
    }
}
