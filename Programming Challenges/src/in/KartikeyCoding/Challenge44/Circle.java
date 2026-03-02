package in.KartikeyCoding.Challenge44;

public class Circle extends shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the Circle is: "+Math.PI*Math.pow(radius,2));
    }
}
