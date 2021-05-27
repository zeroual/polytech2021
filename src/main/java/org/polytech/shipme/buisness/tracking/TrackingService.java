package org.polytech.shipme.buisness.tracking;


import java.util.List;

public interface TrackingService {
    TrackingId initTracking();

    void updateTracking(String trackingId, TrackingUpdate trackingUpdate);

    List<TrackingEvent> trackParcel(String trackingId);
}
