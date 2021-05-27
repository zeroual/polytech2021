package org.polytech.shipme.buisness.notification;

import org.polytech.shipme.buisness.delivery_manager.Recipient;
import org.polytech.shipme.buisness.delivery_manager.Sender;
import org.polytech.shipme.buisness.itinerary.Itinerary;
import org.polytech.shipme.buisness.tracking.TrackingId;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotificationToRecipient(Recipient recipient, TrackingId trackingId, Itinerary itinerary) {

    }

    @Override
    public void sendNotificationToSender(Sender sender, TrackingId trackingId) {

    }
}
