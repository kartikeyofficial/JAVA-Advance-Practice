import java.util.Scanner;

class MaximumValueInArray {
    static void main(String[] args) {
        System.out.println("Welcome to Maximum Value in Array\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" : ");
            newArray[i] = x.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int num: newArray){
            if(max<num){
                max = num;
            }
        }
        System.out.println("Your Maximum Numbers is: "+max);
    }
}
