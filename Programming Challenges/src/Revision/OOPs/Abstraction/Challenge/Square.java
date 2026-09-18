package Revision.OOPs.Abstraction.Challenge;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
