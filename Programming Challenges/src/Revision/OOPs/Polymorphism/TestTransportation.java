package Revision.OOPs.Polymorphism;

public class TestTransportation {
    static void main(String[] args) {
        Car c = new Car();
//    vehicle v = new vehicle();

        vehicle veh = new Car();
//    Car cVehicle = new vehicle();
        veh.start();
        c.start();
        casttest(veh);
    }
    public static void casttest(vehicle veh){  //Reference using abstract class

        veh.start();
    }
}
