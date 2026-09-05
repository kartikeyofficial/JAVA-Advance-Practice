package Revision.Control_Statement;

import java.util.Scanner;

public class ArraySearch {
    static void main(String[] args) {
        System.out.println("Welcome to Max Number in Array\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Size of the Array is: ");
        int size = x.nextInt();
        int[] numArr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the Array Element ("+(i+1)+"): ");
            numArr[i] = x.nextInt();
        }
        int max = maxNumber(numArr);
        System.out.println("Maximum Number in Array is: "+max);

    }

    public static int maxNumber(int[] numArr) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<numArr.length;i++){
            if(max<numArr[i]){
                max = numArr[i];
            }
        }
        return  max;
    }
}
