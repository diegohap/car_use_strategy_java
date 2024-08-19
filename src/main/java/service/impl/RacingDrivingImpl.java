package service.impl;

import entity.Car;
import service.Driving;

public class RacingDrivingImpl implements Driving {

    @Override
    public void drive(Car car) {
        car.setWeaponsActivated(false);
        car.setCamouflageActivated(false);
        System.out.println("Racing on the circuit...");
    }
}
