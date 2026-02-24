package Kartikey.com;

import in.kgCoding.Car;

public class DefaultTest {
    static void main(String[] args) {
        Car car = new Car("Yellow", "Porsche", 2, 30000000);
        car.costOfPurchase=346783546237l;
        System.out.println(car.costOfPurchase);
        System.out.println(car);



    }
}
