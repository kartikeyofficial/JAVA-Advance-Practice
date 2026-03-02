package in.KartikeyCoding.Challenge44;

public class square extends shape{
    private double side;

    public square(double side){
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the Square is: "+Math.pow(side,2));
    }
}
