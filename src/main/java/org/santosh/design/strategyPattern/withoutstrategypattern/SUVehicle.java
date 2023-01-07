package org.santosh.design.strategyPattern.withoutstrategypattern;

public class SUVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.println("Special Implementation of Drive Mode for SUV");
    }
}
