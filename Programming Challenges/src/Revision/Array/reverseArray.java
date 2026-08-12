package Revision.Array;

public class reverseArray {
    static void main(String[] args) {
        System.out.println("Welcome to the Reverse An Array: \n");
        int[] numArr = ArrayUtility.inputArray();
        reverseArr(numArr);
        ArrayUtility.displayArray(numArr);

    }
    public static void reverseArr(int[] numArr){
        for (int i=0; i< numArr.length/2;i++){
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length-1)-i];
            numArr[(numArr.length-1)-i] = swap;
        }

    }
}
