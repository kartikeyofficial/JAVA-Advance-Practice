import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner x = new Scanner(System.in);
        System.out.println("Please Enter The Number Of Element:");
        int size = x.nextInt();
        for(int i =0; i<size;i++){
            System.out.print("Please Enter The No. "+(i+1)+": ");
    }
    }
}
