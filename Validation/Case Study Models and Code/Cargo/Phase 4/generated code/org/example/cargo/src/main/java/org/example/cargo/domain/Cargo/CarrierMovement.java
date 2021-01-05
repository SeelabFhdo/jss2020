package org.example.cargo.domain.Cargo;

import javax.persistence.Entity;

@Entity()
public class CarrierMovement {

    public CarrierMovement() {
    }

    private long scheduleID;

    public long getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(long scheduleID) {
        this.scheduleID = scheduleID;
    }

    public CarrierMovement(long scheduleID) {
        this.scheduleID = scheduleID;
    }
}
