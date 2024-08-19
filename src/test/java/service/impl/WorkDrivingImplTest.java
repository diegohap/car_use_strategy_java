package service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import entity.Car;
import org.junit.jupiter.api.Test;


class WorkDrivingImplTest {

    @Test
    void whenCarUseDayIsMonday_thenCheckForRightText() {
        Car car = new Car();
        assertEquals("MONDAY Driving to work...", car.drive(Car.USE_DAY.MONDAY));
        assertFalse(car.getCamouflageActivated());
        assertFalse(car.getWeaponsActivated());
    }
}