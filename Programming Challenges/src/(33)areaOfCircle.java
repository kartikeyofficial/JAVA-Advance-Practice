import java.sql.SQLOutput;
import java.util.Scanner;

class areaOfCircle {
    static void main(String[] args) {
        System.out.println("Welcome to Area of Circle and Circumference:\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Radius of Circle: ");
        int r = x.nextInt();
        double area = Math.PI*(Math.pow(r,2));
        System.out.println("Area of Circle is: "+area);
        double circumference = 2*Math.PI*(r);
        System.out.println("Circumference of the Circle is: "+circumference);
    }
}
