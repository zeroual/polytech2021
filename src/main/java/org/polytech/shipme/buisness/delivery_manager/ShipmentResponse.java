package org.polytech.shipme.buisness.delivery_manager;

public class ShipmentResponse {
    private final ShipmentResponseStatus status;
    private String trackingId;

    public ShipmentResponse(ShipmentResponseStatus status) {
        this.status = status;
    }

    public ShipmentResponse(ShipmentResponseStatus status, String trackingId) {

        this.status = status;
        this.trackingId = trackingId;
    }

    public ShipmentResponseStatus getStatus() {
        return status;
    }

    public String getTrackingId() {
        return trackingId;
    }

}

