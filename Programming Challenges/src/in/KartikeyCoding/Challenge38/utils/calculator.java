package in.KartikeyCoding.Challenge38.utils;

import in.KartikeyCoding.Challenge38.geometry.circle;
import in.KartikeyCoding.Challenge38.geometry.rectangle;

public class calculator {
    static void main(String[] args) {
        circle c1 = new circle(7.24);
        rectangle r1 = new rectangle(10,8);

        double cirArea = Math.PI * Math.pow(c1.radius, 2);
        long recArea = r1.length* r1.breadth;
        System.out.println("Area of the Circle is: "+cirArea);
        System.out.println("Area of the Rectangle is: "+recArea);
    }
}
