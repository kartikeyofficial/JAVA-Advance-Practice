package Revision.OOPs.Abstraction.Challenge;

public class TestArea {
    static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape square = new Square(5);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
