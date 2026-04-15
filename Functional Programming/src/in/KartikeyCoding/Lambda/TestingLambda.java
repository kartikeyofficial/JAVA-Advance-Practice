package in.KartikeyCoding.Lambda;

public class TestingLambda {
    static void main(String[] args) {
        System.out.println("Hello World!");
        TestingLambda test = new TestingLambda();
        int sum = test.sum(3,6);
        test.printString("this is the best Course");

        //toPrint -> System.out.println(toPrint);
        // (a,b) -> a + b;
        // (a,b) -> {
        // int sum = a + b;
        // System.out.println(sum);
        // }
    }
    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
