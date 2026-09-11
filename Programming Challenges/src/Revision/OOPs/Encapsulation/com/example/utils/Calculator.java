package Revision.OOPs.Encapsulation.com.example.utils;

import Revision.OOPs.Encapsulation.com.example.geometry.Circle;
import Revision.OOPs.Encapsulation.com.example.geometry.Rectangle;

public class Calculator {
    static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10,5);

        double circleArea = Math.PI*Math.pow(circle.radius, 2);
        long rectangleArea = rectangle.getLength()* rectangle.getBreadth();

        System.out.println("Area of the Circle is: "+circleArea);
        System.out.println("Area of the Rectangle id: "+rectangleArea);
    }
}
