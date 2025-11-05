import java.util.Scanner;

public class tryFile {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to Array Input");
        System.out.println("Enter The Size Of Array: ");
        int size = x.nextInt();
        int[] num = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Please Enter The Number "+(i+1)+": ");
            num[i] = x.nextInt();
        }
        System.out.println("Array Elements Are: ");
        for(int j=0; j<size;j++) {
            System.out.print(num[j] + ",");
        }
    }

}
