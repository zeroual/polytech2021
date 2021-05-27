package org.polytech.shipme.buisness.tracking;

import java.time.LocalDateTime;
import java.util.Objects;

public class TrackingEvent {

    private Long id;

    private TrackingId trackingId;

    private LocalDateTime timeStamp;

    private TrackingEventType type;

    public TrackingEvent() {
    }

    public TrackingEvent(LocalDateTime timeStamp, TrackingId trackingId, TrackingEventType type) {
        this.timeStamp = timeStamp;
        this.trackingId = trackingId;
        this.type = type;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public TrackingId getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(TrackingId trackingId) {
        this.trackingId = trackingId;
    }

    public TrackingEventType getType() {
        return type;
    }

    public void setType(TrackingEventType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingEvent that = (TrackingEvent) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(trackingId, that.trackingId) &&
                Objects.equals(timeStamp, that.timeStamp) &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trackingId, timeStamp, type);
    }

    @Override
    public String toString() {
        return "TrackingEvent{" +
                "id=" + id +
                ", trackingId=" + trackingId +
                ", timeStamp=" + timeStamp +
                ", type=" + type +
                '}';
    }
}

