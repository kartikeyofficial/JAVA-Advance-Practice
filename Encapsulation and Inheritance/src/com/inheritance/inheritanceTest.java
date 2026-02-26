package com.inheritance;

public class inheritanceTest {
    static void main(String[] args) {
       Vehicle vehicle = new Vehicle();
       TwoWheelers two = new TwoWheelers();
       vehicle.commute();
       two.commute();
    }
}
