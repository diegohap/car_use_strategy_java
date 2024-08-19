package service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import entity.Car;
import org.junit.jupiter.api.Test;


class OffRoadDrivingImplTest {

    @Test
    void whenCarUseDayIsWednesday_thenCheckForRightText() {
        Car car = new Car();
        assertEquals("WEDNESDAY Driving off-road...", car.drive(Car.USE_DAY.WEDNESDAY));
        assertFalse(car.getCamouflageActivated());
        assertFalse(car.getWeaponsActivated());
    }

    @Test
    void whenCarUseDayIsThursday_thenCheckForRightText() {
        Car car = new Car();
        assertEquals("THURSDAY Driving off-road...", car.drive(Car.USE_DAY.THURSDAY));
        assertFalse(car.getCamouflageActivated());
        assertFalse(car.getWeaponsActivated());
    }

}