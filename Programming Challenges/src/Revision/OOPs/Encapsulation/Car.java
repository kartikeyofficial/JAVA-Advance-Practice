package Revision.OOPs.Encapsulation;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }
    public String toString(){
        return ("Car color is: "+color+"\nCar model is: "+model+"\nCar Fuel Level is: "+fuelLevel+"\nCar Purchase Price: "+costOfPurchase);
    }
}
