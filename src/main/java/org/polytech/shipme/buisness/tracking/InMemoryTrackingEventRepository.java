package org.polytech.shipme.buisness.tracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryTrackingEventRepository implements TrackingEventRepository {
    List<TrackingEvent> trackingEvents = new ArrayList<>();

    @Override
    public void save(TrackingEvent trackingEvent) {
        trackingEvents.add(trackingEvent);
    }

    @Override
    public boolean existsByTrackingId(String trackingId) {
        return trackingEvents.stream().anyMatch(trackingEvent -> trackingId == trackingEvent.getTrackingId().getId());
    }

    @Override
    public List<TrackingEvent> findAllByTrackingId(String trackingId) {
        return trackingEvents.stream().filter(trackingEvent -> trackingId == trackingEvent.getTrackingId().getId()).collect(Collectors.toList());
    }
}
