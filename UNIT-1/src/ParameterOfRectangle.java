import java.util.Scanner;
public class ParameterOfRectangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Side:");
        double a= x.nextDouble();
        System.out.println("Enter The Second Side:");
        double b= x.nextDouble();
        System.out.println("Enter The Third Side:");
        double c= x.nextDouble();
        System.out.println("Enter The Fourth Side:");
        double d= x.nextDouble();

        double parameter= (a+b+c+d);

        System.out.println("Parameter Of Rectangle Is: "+parameter);

    }
}
