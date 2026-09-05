package Revision.Control_Statement;

import java.util.Scanner;

public class SumPositive {
    static void main(String[] args) {
        System.out.println("Welcome to Adding positive Numbers\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array is: ");
        int size = x.nextInt();
        int[] numArr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the Array Element ("+(i+1)+"): ");
            numArr[i] = x.nextInt();
        }
        int sum =0;
        for (int i=0;i< numArr.length;i++){
            if (numArr[i]<0){
                continue;
            }
            sum += numArr[i];
        }
        System.out.println("Sum of Positive Number is: "+sum);

    }
}
