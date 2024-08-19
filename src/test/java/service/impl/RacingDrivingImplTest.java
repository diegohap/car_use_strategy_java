package service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import entity.Car;
import org.junit.jupiter.api.Test;


class RacingDrivingImplTest {

    @Test
    void whenCarUseDayIsTuesday_thenCheckForRightText() {
        Car car = new Car();
        assertEquals("TUESDAY Racing on the circuit...", car.drive(Car.USE_DAY.TUESDAY));
        assertFalse(car.getCamouflageActivated());
        assertFalse(car.getWeaponsActivated());
    }
}