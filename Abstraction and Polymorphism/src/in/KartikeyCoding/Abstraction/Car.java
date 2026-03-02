package in.KartikeyCoding.Abstraction;

public class Car extends vehicle {
    private int noOfDoors;
    public Car(){
        super(4 );
    }

    public void transportDuty(){
        System.out.println("100% Import Duty");
    }


    @Override
    public void makeStartSound() {
        System.out.println("Buhhhhhh.......");
    }

}
