package org.santosh.design.strategyPattern.withstrategypattern.strategy;

public class TaxiDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Have a Speed Lock!! You can't exceed the defined speed limit.");
    }
}
