package Revision.OOPs.Abstraction;

public class Car extends  vehicle{
   private int noOfDoors;
    public Car(int noOfTyres,int noOfDoors) {
        super(noOfTyres);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void makeStartSound() {
        System.out.println("bruhhhhhh......");
    }

    @Override
    public void getSetGo() {
        System.out.println("Lets Go Baby");
    }
}
