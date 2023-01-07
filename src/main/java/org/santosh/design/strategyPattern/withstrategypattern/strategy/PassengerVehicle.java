package org.santosh.design.strategyPattern.withstrategypattern.strategy;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
