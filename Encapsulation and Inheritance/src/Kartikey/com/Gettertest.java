package Kartikey.com;

import GetterSetter.Car;

public class Gettertest {
    static void main(String[] args) {
        Car car = new Car("Red","Ferrari",2,70000000);
        System.out.printf("%s %s\n",car.getColor(),car.getModel());
        car.setColor("Black");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}
