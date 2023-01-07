package org.santosh.design.strategyPattern.withstrategypattern.strategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new TaxiDriveStrategy());
    }
}
