package com.inheritance;

public class inheritanceTest {
    static void main(String[] args) {
       Vehicle vehicle = new Vehicle();
       TwoWheelers two = new TwoWheelers();
       vehicle.commute();
       two.commute();
       two.balance();
       System.out.println(vehicle.toString());
       System.out.println(vehicle.getClass());

       MotorCycle motor = new MotorCycle();
       motor.commute();
       motor.start();
       motor.balance();
    }
}
