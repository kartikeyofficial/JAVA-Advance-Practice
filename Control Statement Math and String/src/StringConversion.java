public class StringConversion {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public StringConversion(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "StringConversion{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    static void main(String[] args) {
         StringConversion swift = new StringConversion(4,4,200,"Swift","36745765","Maruti Suzuki");
        System.out.println(swift);
    }
}
