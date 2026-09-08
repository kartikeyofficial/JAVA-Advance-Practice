package Revision.ToString;

public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
    public String toString(){
        return "My Car name is: "+name;
    }

    static void main(String[] args) {
        Car swift = new Car(4,4,200,"Suzuki Swift","0987654321","Maruti");
        System.out.println(swift.toString());
        String str1 = "abc";
        String str2 = "abc";
        if (str1.equals(str2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
