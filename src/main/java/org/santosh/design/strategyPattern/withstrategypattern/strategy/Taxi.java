package org.santosh.design.strategyPattern.withstrategypattern.strategy;

public class Taxi extends Vehicle {
    public Taxi() {
        super(new TaxiDriveStrategy());
    }
}
