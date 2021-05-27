package org.polytech.shipme.buisness.tracking;


import java.util.UUID;

class TrackingIdGeneratorImpl implements TrackingIdGenerator {
    @Override
    public TrackingId generateUniqueId() {
        return new TrackingId(UUID.randomUUID().toString());
    }
}
