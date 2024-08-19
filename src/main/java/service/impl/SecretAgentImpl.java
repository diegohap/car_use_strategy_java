package service.impl;

import entity.Car;
import service.Driving;

public class SecretAgentImpl implements Driving {

    @Override
    public String drive(Car car) {
        car.setWeaponsActivated(true);
        car.setCamouflageActivated(true);
        return "Activating camouflage and weapons...";
    }
}
