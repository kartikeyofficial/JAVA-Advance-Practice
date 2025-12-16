import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Base Of Triangle in CMs:");
        double base= x.nextDouble();
        System.out.println("Enter The Perpendicular Height in CMs:");
        double height= x.nextDouble();

        double area = 0.5*base*height;

        System.out.println("Area Of Triangle is: "+area+" CMs");
    }
}
