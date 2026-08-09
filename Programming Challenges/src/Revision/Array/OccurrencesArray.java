package Revision.Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OccurrencesArray {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Occurrences Array\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the Number You Want to Find: ");
        int num = x.nextInt();
        int occurrences = noOfOccurrences(numArr,num);
        System.out.println("Your Element was Found "+occurrences+" times in Array!");

    }
    public static int noOfOccurrences(int[] numArr, int num){
        int occ=0;
        for (int i=0;i<numArr.length;i++){
            if(numArr[i]==num) {
                occ++;
            }
        }
        return occ;
    }
}
