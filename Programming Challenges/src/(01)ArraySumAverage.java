import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to array Sum and Average\n");
        int[] numArray = Arrayutility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of The Numbers is: "+sum);
        System.out.println("Average of the Numbers: "+avg);

    }
    public static long sum(int[] numArray){
        long sum =0;
        for (int i=0; i<numArray.length;i++){
            sum += numArray[i];
        }
        return sum;
    }
    public static double average(int[] numArray){
        double sum = sum(numArray);
        return (sum/numArray.length);
    }

}
