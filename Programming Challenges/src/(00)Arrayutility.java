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
    public static int[][] input2DArray(){
        Scanner x= new Scanner(System.in);
        System.out.print("Please Enter The Numbers of Rows: ");
        int rows = x.nextInt();
        System.out.print("Please Enter The Numbers of Columns: ");
        int cols = x.nextInt();
        int[][] numArray = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Plaese Enter The Elements Of The 2D array ("+(i+1)+","+(j+1)+"): ");
                numArray[i][j] = x.nextInt();

            }
        }
        return numArray;

    }


}
