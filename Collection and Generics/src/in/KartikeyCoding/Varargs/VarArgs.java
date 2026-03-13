package in.KartikeyCoding.Varargs;

public class VarArgs {
    static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(sum(1,3,4,5,6));
    }
    public static int sum(int a, int b){
        return  a+b;
    }
    public static int sum(int... a){
        int sum =0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }
}
