package Revision.OOPs.Inheritance;

public class Vehicle {
    private int numberOfTyres;

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void commute(){
        System.out.printf("I am Going from Place A to Place B Using %d tyres.\n",numberOfTyres
        );
    }
}
