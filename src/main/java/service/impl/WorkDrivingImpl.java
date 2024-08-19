package service.impl;

import entity.Car;
import service.Driving;

public class WorkDrivingImpl implements Driving {

    @Override
    public void drive(Car car) {
        car.setWeaponsActivated(false);
        car.setCamouflageActivated(false);
        System.out.println("Driving to work...");
    }
}
