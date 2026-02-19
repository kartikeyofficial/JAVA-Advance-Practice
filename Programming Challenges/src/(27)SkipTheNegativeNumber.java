import java.util.Scanner;

class SkipTheNegativeNumber {
    static void main(String[] args) {
        System.out.println("Welcome to Addition of Only Positive Number\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" : ");
            newArray[i] = x.nextInt();
        }
        int sum =0;
        for (int i=0;i< newArray.length;i++){
            if (newArray[i]<=(-1)){
                continue;
            }
            sum += newArray[i];

        }
        System.out.println("Your Positive Number Sum is: "+sum);
    }
}
