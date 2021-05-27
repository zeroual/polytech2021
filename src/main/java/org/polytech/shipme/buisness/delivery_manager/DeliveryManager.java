package org.polytech.shipme.buisness.delivery_manager;

public interface DeliveryManager {
    ShipmentResponse process(ShipmentRequest shipmentRequest);
}
