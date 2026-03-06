package in.KartikeyCoding.Polymorphism;

public class Overloading {
    public int sum(int a, int b){
        return  a+b;
    }

    public int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public String sum(String a, String b){
        return a+b;
    }


    static void main(String[] args) {
        Overloading over = new Overloading();
        System.out.println("Sum of Two Numbers is: "+over.sum(3,5));
        System.out.println("sum of Four Numbers is: "+over.sum(2,3,6,7));
        System.out.println("Concatenate of Two String Is: "+over.sum("Kartikey"," Rajput"));
    }
}
