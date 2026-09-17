package Revision.OOPs.challenges;

public class TestArray {
    static void main(String[] args) {
        MeanAndMedian arr1 = new MeanAndMedian(new int[]{1,2,3,4,5,6});
        MeanAndMedian.Statistics statistics =arr1.new Statistics();
        System.out.println(statistics.mean());
    }
}
