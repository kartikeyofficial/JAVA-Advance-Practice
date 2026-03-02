package in.KartikeyCoding.Abstraction;

public class testAbstraction {
    static void main(String[] args) {
//        vehicle veh = new vehicle(2);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
        car.getSetGo();
        car.transportDuty();
    }

}
