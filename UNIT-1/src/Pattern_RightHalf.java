import java.util.Scanner;

public class Pattern_RightHalf {
    public static void main(String[] args) {
        System.out.println("Welcome to Right Half Pyramid\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows:");
        int rows = x.nextInt();
        printRightHalfPyramid(rows);
        System.out.println("\n");
        printRectangle(rows);
        System.out.println("\n");
        printRightLowerPyramid(rows);
        System.out.println("\n");
        hillPattern(rows);
        System.out.println("\n");
        reverseHillPattern(rows);

    }
    public static void reverseHillPattern(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<= i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<rows; j++){
                System.out.print("* ");
            }
            for(int j=i; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hillPattern(int rows){
        for (int i =0; i<rows; i++){
            for(int j=i ; j<rows ; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int rows ){
        for(int i=0;i< rows; i++){
            for(int j=0; j<rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void printRightLowerPyramid(int rows){
        for (int i=0; i<rows;i++){
            for(int j=i;j<rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printRightHalfPyramid(int rows){

        for(int i=0; i< rows;i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
