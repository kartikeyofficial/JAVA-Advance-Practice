package Revision.Array;

public class MergeTwoSortedArray {
    static void main(String[] args) {
        System.out.println("Welcome to Merged Sorted Array: \n");
        System.out.println("First Array\n");
        int[] Arr1 = ArrayUtility.inputArray();
        System.out.println("Second Array\n");
        int[] Arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(Arr1,Arr2);
        System.out.println("Your Merged Sorted Array is: ");
        ArrayUtility.displayArray(mergedArr);
    }
    public static int[] merge(int[] Arr1, int[] Arr2){
        int newSize = Arr1.length+Arr2.length;
        int[] newArr = new int[newSize];
        int i=0, j=0, k=0;
        while (i<Arr1.length || j<Arr2.length){
            if(j==Arr2.length || (i<Arr1.length && Arr1[i]<Arr2[j])){
               newArr[k] = Arr1[i];
                i++;
                k++;
            }else {
                newArr[k] = Arr2[j];
                j++;
                k++;
            }

        }
        return newArr;

    }

}
