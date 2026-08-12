package Revision.Array;

public class sumAndAverageArray {
    static void main(String[] args) {
        System.out.println("Welcome to Sum & Average of the Array \n");
        int[][] numArr = ArrayUtility.input2DArray();
        int sum = sum(numArr);
        System.out.println("Addition of the Array Element is: "+sum);
        float average = average(numArr);
        System.out.println("Average of the Array Elements is: "+average);
        
    }
    public static int sum(int[][] numArr){
        int add=0;
        for (int i=0;i<numArr.length;i++){
            for (int j=0;j< numArr.length;j++){
                add +=numArr[i][j];
            }
        }
        return  add;
    }
    public static float average(int[][] numArr){
        int sum = sum(numArr);
        return (float)(sum/ (numArr.length* numArr.length));
    }

}
