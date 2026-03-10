package in.KartikeyCoding.PassBy;

public class TestPassByValue {
    static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum = add(x,y);
        System.out.println("Sum of Two Numbers: "+sum);


    }
    public static int add(int a , int b){
        return a+b;
    }
}
