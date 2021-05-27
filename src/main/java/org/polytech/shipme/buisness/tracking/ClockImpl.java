package org.polytech.shipme.buisness.tracking;


import java.time.LocalDateTime;

public class ClockImpl implements Clock {
    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
