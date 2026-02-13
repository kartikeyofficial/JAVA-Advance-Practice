public class driver {
    static void main(String[] args) {
//        Car mycar = new Car();
//        mycar.addFuel(6.0f);
//        mycar.drive();
//        mycar.drive();
//        mycar.drive();
//        mycar.addFuel(2);
//        mycar.drive();
//        System.out.println(mycar.getCurrentFuelLevel());
//        mycar.AddColor("Red");
//        mycar.addSeats(4);

        Car swift = new Car("Red");
        Car Thar = new Car();
        swift.start().drive();
//        swift.addFuel(6);
//        Car startedCar = swift.start();
//        swift.drive();
        System.out.println(swift.color );
        System.out.println("My Thar Color is "+Thar.color);

    }
}
