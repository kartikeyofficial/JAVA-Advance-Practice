package in.KartikeyCoding.Polymorphism;

public class OverLoadingConstructor {
    public OverLoadingConstructor(){
        System.out.println("Default Constructor!");
    }
    public OverLoadingConstructor(String name){
        System.out.println(name);
    }

    static void main(String[] args) {
        OverLoadingConstructor over = new OverLoadingConstructor();
        OverLoadingConstructor name = new OverLoadingConstructor("Kumar Kartikey");
        System.out.println(over);
        System.out.println(name);

    }
}
