package org.polytech.shipme.api.shipment;

import org.polytech.shipme.buisness.delivery_manager.DeliveryManager;
import org.polytech.shipme.buisness.delivery_manager.ShipmentRequest;
import org.polytech.shipme.buisness.delivery_manager.ShipmentResponse;


public class ShipmentController {

    private DeliveryManager deliveryManager;

    public ShipmentController(DeliveryManager deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    // POST /shipments
    public ShipmentResponse ship(ShipmentRequest shipmentRequest) {
        return deliveryManager.process(shipmentRequest);
    }
}
