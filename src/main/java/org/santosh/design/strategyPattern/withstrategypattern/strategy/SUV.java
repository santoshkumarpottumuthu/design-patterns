package org.santosh.design.strategyPattern.withstrategypattern.strategy;

public class SUV extends Vehicle{
    public SUV() {
        super(new SportsDriveStrategy());
    }
}
