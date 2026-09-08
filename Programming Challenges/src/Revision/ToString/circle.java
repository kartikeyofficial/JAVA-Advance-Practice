package Revision.ToString;



import java.util.Scanner;

public class circle {

    double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    double getCircumference(){
        return 2 * radius * Math.PI;
    }
    double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "The Radius of the Circle is: "+radius
                +"\nThe Circumference of the Circle is: "+getCircumference()
                +"\nThe Area of the Circle is: "+getArea();
    }

    static void main(String[] args) {
        System.out.println("Welcome to Area And Circumference of the Circle");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle is: ");
        double radius = x.nextDouble();
        circle c1 = new circle(radius);
        System.out.println(c1);

    }
}
