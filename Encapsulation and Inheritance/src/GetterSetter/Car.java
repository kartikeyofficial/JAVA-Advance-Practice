package GetterSetter;

public class Car {
    private String color;   //public
    private String model;   //public
    private double fuelLevel;
    private  long costOfPurchase;

    public String getColor(){
        return color;
    }
   public void setColor(String color){
        if (color.equals("Yellow")){
            System.out.println("You are Joking");
        }
        else {
            this.color = color;
        }
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

}
