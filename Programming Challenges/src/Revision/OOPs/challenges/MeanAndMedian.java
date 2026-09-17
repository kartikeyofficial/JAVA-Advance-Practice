package Revision.OOPs.challenges;

public class MeanAndMedian {
    private  int[] numbers;

    public MeanAndMedian(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int num : numbers){
                sum += num;
            }
            return sum/ numbers.length;
        }

//        double median(){
//
//        }
    }
}
