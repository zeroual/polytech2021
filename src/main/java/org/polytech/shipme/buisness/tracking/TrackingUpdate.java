package org.polytech.shipme.buisness.tracking;


public class TrackingUpdate {
     private TrackingEventType type;
     private Position position;

    public TrackingUpdate() {
    }

    public TrackingEventType getType() {
        return type;
    }

    public void setType(TrackingEventType type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
