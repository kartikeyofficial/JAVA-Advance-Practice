import java.util.Scanner;

class MergeTwoSortedArray {
    static void main(String[] args) {
        System.out.println("Welcome to Merge Two Sorted Array!\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of 1st Array: ");
        int size1 = x.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter The First Array:\n");
        for (int i=0;i<size1;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" is: ");
            arr1[i] = x.nextInt();
        }
        System.out.print("\nEnter The Size of 2nd Array: ");
        int size2 = x.nextInt();
        System.out.print("Enter The Second Array:\n");
        int[] arr2 = new int[size2];
        for (int i=0;i<size2;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" is: ");
            arr2[i] = x.nextInt();
        }
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("Your Merge Array is:");
        for (int i=0;i<mergedArr.length;i++){
            System.out.print(mergedArr[i]+" ");
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArray = new int[newSize];
        int i=0, j=0, k=0;
        while (i<arr1.length || j<arr2.length ){
            if(j == arr2.length||(i < arr1.length && arr1[i]<arr2[j])){
                newArray[k] = arr1[i];
                i++;
                k++;
            }else {
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArray;
    }
}
