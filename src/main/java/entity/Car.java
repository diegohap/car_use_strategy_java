package entity;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import service.Driving;
import service.impl.OffRoadDrivingImpl;
import service.impl.RacingDrivingImpl;
import service.impl.SecretAgentImpl;
import service.impl.WorkDrivingImpl;

@Getter
public class Car {
    @Setter
    private Boolean weaponsActivated;
    @Setter
    private Boolean camouflageActivated;

    private Map<USE_DAY, Driving> dayDrivingMap;

    public Car() {
        this.weaponsActivated = false;
        this.camouflageActivated = false;
        this.dayDrivingMap = new HashMap<>();
        dayDrivingMap.put(USE_DAY.MONDAY, new WorkDrivingImpl());
        dayDrivingMap.put(USE_DAY.TUESDAY, new RacingDrivingImpl());
        dayDrivingMap.put(USE_DAY.WEDNESDAY, new OffRoadDrivingImpl());
        dayDrivingMap.put(USE_DAY.THURSDAY, new OffRoadDrivingImpl());
        dayDrivingMap.put(USE_DAY.FRIDAY, new SecretAgentImpl());
    }

    public void drive(USE_DAY useDay) {
        dayDrivingMap.get(useDay).drive(this);
    }

    public enum USE_DAY {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY
    }
}
