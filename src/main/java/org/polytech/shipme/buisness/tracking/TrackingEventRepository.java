package org.polytech.shipme.buisness.tracking;

import java.util.List;

public interface TrackingEventRepository {
    void save(TrackingEvent trackingEvent);

    boolean existsByTrackingId(String trackingId);

    List<TrackingEvent> findAllByTrackingId(String trackingId);
}
