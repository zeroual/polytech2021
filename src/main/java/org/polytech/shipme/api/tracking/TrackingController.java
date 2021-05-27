package org.polytech.shipme.api.tracking;

import org.polytech.shipme.buisness.tracking.TrackingEvent;
import org.polytech.shipme.buisness.tracking.TrackingService;
import org.polytech.shipme.buisness.tracking.TrackingUpdate;

import java.util.List;


public class TrackingController {

    private TrackingService trackingService;

    public TrackingController(TrackingService trackingService) {
        this.trackingService = trackingService;
    }

    public void trackUpdate( String trackingId, TrackingUpdate trackingUpdate) {
        this.trackingService.updateTracking(trackingId, trackingUpdate);
    }

    public List<TrackingEvent> trackParcel( String trackingId){
        return trackingService.trackParcel(trackingId);
    }

}
