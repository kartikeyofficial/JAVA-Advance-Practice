import java.util.Scanner;

class Arrayutility {
    public static int[] inputArray(){
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter the number of elements:");
        int size  = x.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Please Enter Element Number"+(i+1)+" : ");
            nums[i] = x.nextInt();
        }
        return nums;

    }
    public static void displayArray(int[] nums){
        for (int i=0;i<nums.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
