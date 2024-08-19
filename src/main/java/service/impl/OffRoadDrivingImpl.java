package service.impl;

import entity.Car;
import service.Driving;

public class OffRoadDrivingImpl implements Driving {

    @Override
    public String drive(Car car) {
        car.setWeaponsActivated(false);
        car.setCamouflageActivated(false);
        return "Driving off-road...";
    }
}
