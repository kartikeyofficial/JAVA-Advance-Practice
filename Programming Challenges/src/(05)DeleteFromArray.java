import java.util.Scanner;

class DeleteFromArray {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Array Deletion\n");
        System.out.println("Enter The Array Limit Do You Want: ");
        int size = x.nextInt();

        int[] numArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+": ");
            numArray[i]= x.nextInt();
        }
        System.out.println("Now Emter The Number Do you want to Delete:");
        int numToDelete = x.nextInt();
        int[] newArr = deleteNumber(numArray,numToDelete);
        System.out.println("Here is Your New Array ");
        for (int i=0;i<numArray.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static int[] deleteNumber(int[] numArray,int numToDelete){
       int occ = OccurrencesArray.noOfOccurrences(numArray,numToDelete);
       if(occ == 0){
           return numArray;
       }
       int newSize = numArray.length - occ;
       int[] newArr= new int[newSize];
       return newArr;
    }
}
