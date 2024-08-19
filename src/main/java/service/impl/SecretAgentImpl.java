package service.impl;

import entity.Car;
import service.Driving;

public class SecretAgentImpl implements Driving {

    @Override
    public void drive(Car car) {
        car.setWeaponsActivated(true);
        car.setCamouflageActivated(true);
        System.out.println("Activating camouflage and weapons...");
    }
}
