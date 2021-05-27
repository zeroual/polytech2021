package org.polytech.shipme.buisness.notification;

import org.polytech.shipme.buisness.delivery_manager.Recipient;
import org.polytech.shipme.buisness.delivery_manager.Sender;
import org.polytech.shipme.buisness.itinerary.Itinerary;
import org.polytech.shipme.buisness.tracking.TrackingId;

public interface NotificationService {

    void sendNotificationToRecipient(Recipient recipient, TrackingId trackingId, Itinerary itinerary);

    void sendNotificationToSender(Sender sender, TrackingId trackingId);
}
