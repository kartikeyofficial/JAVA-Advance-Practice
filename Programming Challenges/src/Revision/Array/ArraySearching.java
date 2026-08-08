package Revision.Array;

import java.util.Scanner;

public class ArraySearching {
    static void main(String[] args) {
        System.out.println("welcome to Array Searching");
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number Do You Want to Search: ");
        int key = x.nextInt();
        for (int i=0;i<nums.length;i++){
            if(key==nums[i]){
                System.out.println("That the Number "+key+" is Present at Index: "+i);
               
            }
        }
    }
}
