public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelLevelInLeters;
    int noOfSeats;

    Car(String color){
        this.color = color;
        noOfSeats = 5;
        maxSpeed = 220;
        currentFuelLevelInLeters = 2;
        noOfWheels = 4;
    }
    Car(){
        this("Zet balck");
        currentFuelLevelInLeters = 6;
    }

    public Car start(){
        if(currentFuelLevelInLeters==0){
            System.out.println("Car is out of Fuel can Not Start");
        } else if (currentFuelLevelInLeters<5) {
            System.out.println("Car is in Reserved mode, Please Refuel!");
            currentFuelLevelInLeters--;

        }else {
            System.out.println("Car is Started .... bruhhhhh....");
            currentFuelLevelInLeters--;
        }
        return this;
    }

    public void drive(){
            currentFuelLevelInLeters--;
        System.out.println("Car is Driving");
    }

    public void addFuel(float fuel){
        currentFuelLevelInLeters += fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelLevelInLeters;
    }
    public void AddColor(String color){
        System.out.println("Car Color is "+color);
    }
    public void addSeats(int noOfSeats){
        System.out.println("Total Seats In Car Is: "+noOfSeats);
    }


}
