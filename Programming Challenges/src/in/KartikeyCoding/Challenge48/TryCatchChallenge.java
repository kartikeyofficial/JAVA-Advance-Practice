package in.KartikeyCoding.Challenge48;

public class TryCatchChallenge {
    public static void Division(int a, int b){
        try{
            System.out.println("Division of Two Numbers is: "+(a/b));
        }
        catch (ArithmeticException ae){
            System.out.println("Exception is Occurs Because of Numerator is Divided by Zero Denominator");
        }
    }
}
