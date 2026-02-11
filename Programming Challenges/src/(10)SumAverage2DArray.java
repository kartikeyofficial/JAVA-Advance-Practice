import java.util.Scanner;

class SumAverage2DArray {
    static void main(String[] args) {
        System.out.println("Welcome to The Sum And Average Of 2D Array\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of The Rows: ");
        int rows = x.nextInt();
        System.out.print("Enter The Size of The Columns: ");
        int cols = x.nextInt();
        int[][] newArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j< cols; j++) {
                System.out.print("Enter The Elements Of 2D Array is (" + (i + 1) + "," + (j + 1) + "): ");
                newArray[i][j] = x.nextInt();
            }
        }
        long sum = sum(newArray);
        double avg = avg(newArray);
        System.out.println("Sum Of 2D Array is: "+sum);
        System.out.println("Average Of 2D Array is: "+avg);

    }

    public static long sum(int[][] newArray) {
        long sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                sum += newArray[i][j];

            }

        }
        return sum;
    }
    public static double avg(int[][] newArray){
        if(newArray.length==0){
            return 0;
        }
        int rows = newArray.length;
        int cols = newArray[0].length;
        double sum = sum(newArray);
        double size = rows*cols;
        return (sum/size);
    }
}
