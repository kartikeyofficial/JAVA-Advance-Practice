

public class SumAndAverageOfArray {
    public static void main(String[] args) {

        System.out.println("Welcome To array Sum And Average");
        int[] numArray= ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average= average(numArray);
        System.out.println("Sum OF the numbers is: "+sum);
        System.out.println("Average Of The numbers is: "+average);
    }
    public static  long sum(int[] numArray){
        long sum=0;
        for(int i =0; i<numArray.length;i++){
            sum +=numArray[i];
        }
       return sum;
    }
    public static double average(int[] numArray){
        double sum= sum(numArray);
        return  (sum/numArray.length);
    }
}
