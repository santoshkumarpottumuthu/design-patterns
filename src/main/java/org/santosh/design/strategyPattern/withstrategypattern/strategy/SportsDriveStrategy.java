package org.santosh.design.strategyPattern.withstrategypattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special Implementation of Drive Mode for SUV");
    }
}
