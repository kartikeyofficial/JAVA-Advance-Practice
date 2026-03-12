package in.KartikeyCoding.ThrowAndThrows;

public class ThrowsAndThrow {
    public static void PrintName(String name) throws IllegalArgumentException{
        if (name.equals("-")){
            throw new IllegalArgumentException("Name Contains -");
        }
        else {
            System.out.println(name);
        }
    }

    static void main(String[] args) {
        PrintName("Kart-ikey");
    }

}
