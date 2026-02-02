import java.util.Scanner;

public class OccurancesArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Array Occurances:");
        System.out.print("Enter The Size Of Array: ");
        int size= x.nextInt();
        int[] numArray = new int[size];
        for(int i=0; i<size;i++){
            System.out.print("Enter The Array Number "+(i+1)+": ");
            numArray[i] = x.nextInt();
        }
        System.out.println("Now Enter the Number You want to be Search:");
        int num = x.nextInt();
        int Occurance= noOfOccurances(numArray, num);
        System.out.println("Your Element was Found "+Occurance+" Times in The Array");
    }
    public static int noOfOccurances(int[] numArray, int num){
        int counter= 0;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]==num){
                counter=counter+1;
            }
        }
        return counter;
    }
}
