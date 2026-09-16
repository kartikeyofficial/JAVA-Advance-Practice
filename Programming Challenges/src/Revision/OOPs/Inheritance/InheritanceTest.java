package Revision.OOPs.Inheritance;
 
public class InheritanceTest {
    static void main(String[] args) {
       Vehicle vehicle = new Vehicle();

       TwoWheeler two = new TwoWheeler();
       vehicle.commute();
       two.commute();

       MotorCycle motor = new MotorCycle();
       motor.commute();
       motor.balance();
       motor.start();
    }
}
