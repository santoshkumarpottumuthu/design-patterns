package org.santosh.design;

import org.santosh.design.strategyPattern.withstrategypattern.strategy.NormalDriveStrategy;
import org.santosh.design.strategyPattern.withstrategypattern.strategy.SUV;
import org.santosh.design.strategyPattern.withstrategypattern.strategy.Taxi;
import org.santosh.design.strategyPattern.withstrategypattern.strategy.Vehicle;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Taxi taxi = new Taxi();
//        taxi.drive();

//
//        Vehicle vehicle = new SUV();
//        vehicle.drive();
        Vehicle vehicle = new Vehicle(new NormalDriveStrategy());
        vehicle.drive();

    }

}