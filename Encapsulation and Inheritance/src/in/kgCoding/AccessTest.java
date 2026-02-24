package in.kgCoding;

public class AccessTest {
    static void main(String[] args) {
        Car car = new Car();
        car.color="Red";
        car.model="BMW";
        car.costOfPurchase=67453687756l;
        System.out.println(car);
        Car newCar = new Car("Black","Mercedes",1,20000000);
        System.out.println(newCar);

    }
}
