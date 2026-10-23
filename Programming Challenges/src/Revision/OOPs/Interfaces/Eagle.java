package Revision.OOPs.Interfaces;

public class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle is Fly");
    }

    static void main(String[] args) {
        Flyable eagle = new Eagle();
        eagle.fly();
    }
}
