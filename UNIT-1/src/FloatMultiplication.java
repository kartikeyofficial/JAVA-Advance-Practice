import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Decimal Number:");
        double a= x.nextDouble();
        System.out.println("Enter The Second Decimal Number:");
        double b= x.nextDouble();

        double c= a*b;

        System.out.println("Product of Two Numbers:"+c);

    }
}
