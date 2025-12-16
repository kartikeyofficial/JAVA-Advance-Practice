import java.util.Scanner;

public class Array_Searching {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] arr= {54,67,53,87,98,20,36,12,11,43};
        System.out.println("Welcome to Array Searching\n");
        System.out.println("Enter The Number You Want to Search:");
        int num = x.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("Your Number was Found in the Array");
        }
        else {
            System.out.println("Your Number was Not Found in the Array");
        }
    }
    public static boolean isFound(int[] arr, int num){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==num){
                return  true;
            }
        }
        return false;
    }
}
