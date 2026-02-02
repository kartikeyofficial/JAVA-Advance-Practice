import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Welcome to Array Sorted Check Post\n");
        System.out.print("Enter The Size Of Arrray: ");
        int size= x.nextInt();
        int[] numArray = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Enter The Array Elements"+(i+1)+": ");
            numArray[i]= x.nextInt();
        }
        boolean isIncreasing= isIncreasing(numArray);
        boolean isDecreasing= isDecreasing(numArray);
        if(isIncreasing || isDecreasing){
            System.out.println("Your Array Is Sorted");
        }
        else {
            System.out.println("Your Array Is Not Sorted");
        }

        }
    public static boolean isIncreasing(int[] numArray){
        for(int i=1; i<numArray.length;i++){
            if(numArray[i]<numArray[i-1]){
                return  false;
            }
        }
        return true;
    }
    public static  boolean isDecreasing(int[] numArray){
        for(int i=1; i<numArray.length;i++){
            if(numArray[i]> numArray[i-1]){
                return  false;
            }
        }
        return true;
    }
}
