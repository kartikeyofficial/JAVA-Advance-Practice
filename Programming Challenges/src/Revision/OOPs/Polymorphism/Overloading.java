package Revision.OOPs.Polymorphism;

public class Overloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public String add(String a, String b){
        return a+b;
    }

    static void main(String[] args) {
        Overloading over = new Overloading();
        System.out.println(over.add(1,3));
        System.out.println(over.add("Kumar ","Kartikey"));
        System.out.println(over.add(1,2,3));

    }
}
