package in.KartikeyCoding.Challenge46;

public class Calculator {
    public static void add(int a, int b){
        System.out.println("Sum of Two Integer is: "+(a+b));
    }
    public static void add(int a, int b, int c){
        System.out.println("Sum of Three Integer is: "+(a+b+c));
    }
    public static void add(double a,double b){
        System.out.println("Sum of Two Double is: "+(a+b));
    }

    static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(1,2);
        c1.add(1,2,3);
        c1.add(1.4,4.6);
    }
}
