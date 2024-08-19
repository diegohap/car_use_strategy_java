package service.impl;

import entity.Car;
import service.Driving;

public class WorkDrivingImpl implements Driving {

    @Override
    public String drive(Car car) {
        car.setWeaponsActivated(false);
        car.setCamouflageActivated(false);
        return "Driving to work...";
    }
}
