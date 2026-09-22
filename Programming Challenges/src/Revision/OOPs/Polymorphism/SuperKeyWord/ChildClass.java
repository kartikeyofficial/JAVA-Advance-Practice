package Revision.OOPs.Polymorphism.SuperKeyWord;

public class ChildClass extends parentsClass{

    public String model;

    ChildClass(int noOfDoors,String model){
        super(noOfDoors);
        this.model = model;
    }

    static void main(String[] args) {
        ChildClass c1 = new ChildClass(5,"Ferrari");
        System.out.println(c1.noOfDoors);
        System.out.println(c1.model);
        parentsClass p1 = new parentsClass(4,5);
        p1.getNoOfTyres();
    }
}
