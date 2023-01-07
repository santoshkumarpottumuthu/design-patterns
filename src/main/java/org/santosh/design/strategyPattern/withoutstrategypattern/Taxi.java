package org.santosh.design.strategyPattern.withoutstrategypattern;

public class Taxi extends Vehicle{

    @Override
    public void drive() {
        System.out.println("Have a Speed Lock!! You can't exceed the defined speed limit.");
    }
}
