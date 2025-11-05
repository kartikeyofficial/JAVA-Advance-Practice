import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Welcome to Array Deletion: \n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Now, Enter Then Number You Want to Delete: ");
        int numToDelete = x.nextInt();
        int[] newArr= deleteArray(numArray,numToDelete);
        System.out.println("Here is Your Array");
        ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteArray(int[] numArray, int numToDelete){
        int occ = OccurancesArray.noOfOccurances(numArray,numToDelete);
        if(occ ==0){
            return numArray;
        }
        int newSize = numArray.length - occ;
        int[] newArr = new int[newSize];

        int i=0, j=0;
        while(i<numArray.length){
            if(numArray[i] != numToDelete){
               newArr[j]= numArray[i];
               j++;
            }
            i++;
        }
        return  newArr;
    }
}
