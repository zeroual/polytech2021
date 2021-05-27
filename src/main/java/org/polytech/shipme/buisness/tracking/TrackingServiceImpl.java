package org.polytech.shipme.buisness.tracking;


import java.time.LocalDateTime;
import java.util.List;

public class TrackingServiceImpl implements TrackingService {

    private TrackingEventRepository trackingEventRepository;
    private Clock clock;
    private TrackingIdGenerator trackingIdGenerator;

    public TrackingServiceImpl(TrackingEventRepository trackingEventRepository,
                               Clock clock,
                               TrackingIdGenerator trackingIdGenerator) {
        this.trackingEventRepository = trackingEventRepository;
        this.clock = clock;
        this.trackingIdGenerator = trackingIdGenerator;
    }

    @Override
    public TrackingId initTracking() {
        TrackingId trackingId = trackingIdGenerator.generateUniqueId();
        LocalDateTime now = clock.now();

        TrackingEvent trackingEvent = new TrackingEvent(now, trackingId, TrackingEventType.RECEIVED_BY_COURIER);
        trackingEventRepository.save(trackingEvent);
        return trackingId;
    }

    @Override
    public void updateTracking(String trackingId, TrackingUpdate trackingUpdate) {
        if (this.trackingEventRepository.existsByTrackingId(trackingId)) {
            TrackingEvent trackingEvent = new TrackingEvent(LocalDateTime.now(), new TrackingId(trackingId), trackingUpdate.getType());
            trackingEventRepository.save(trackingEvent);
        }
    }

    @Override
    public List<TrackingEvent> trackParcel(String trackingId) {
        return this.trackingEventRepository.findAllByTrackingId(trackingId);
    }
}
