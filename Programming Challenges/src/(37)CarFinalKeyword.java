class CarFinalKeyword {
    final int noOfWheels;
    final String model;
    final String EngineHorsePower;

    public CarFinalKeyword(int noOfWheels, String model, String EngineHorsePower) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.EngineHorsePower = EngineHorsePower;

    }

    @Override
    public String toString() {
        return "Car Properties{ noOfWheels "+noOfWheels+"" +
                ", model "+model+"" +
                ", EnginePower "+EngineHorsePower+" HP}";
    }

    static void main(String[] args) {
        CarFinalKeyword car = new CarFinalKeyword(4,"BMW M3 Competition","750");
        System.out.println(car);
    }
}
