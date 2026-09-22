package Revision.OOPs.Polymorphism.SuperKeyWord;

public class parentsClass {
    public int noOfTyres;
    public int noOfDoors;



    public parentsClass(int noOfTyres,int noOfDoors){
        this.noOfTyres = 4;
        this.noOfDoors = 5;

    }

    public parentsClass(int noOfDoors) {
        this.noOfDoors = noOfDoors;

    }

    public void getNoOfTyres() {
        System.out.println(noOfTyres);
    }
}
