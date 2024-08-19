package service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import entity.Car;
import org.junit.jupiter.api.Test;


class SecretAgentImplTest {

    @Test
    void whenCarUseDayIsFriday_thenCheckForRightText() {
        Car car = new Car();
        assertEquals("FRIDAY Activating camouflage and weapons...", car.drive(Car.USE_DAY.FRIDAY));
        assertTrue(car.getCamouflageActivated());
        assertTrue(car.getWeaponsActivated());
    }
}