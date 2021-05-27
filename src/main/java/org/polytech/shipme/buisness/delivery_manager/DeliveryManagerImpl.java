package org.polytech.shipme.buisness.delivery_manager;

import org.polytech.shipme.buisness.itinerary.Itinerary;
import org.polytech.shipme.buisness.notification.NotificationService;
import org.polytech.shipme.buisness.payment.PaymentRefusedException;
import org.polytech.shipme.buisness.payment.PaymentService;
import org.polytech.shipme.buisness.tracking.TrackingId;
import org.polytech.shipme.buisness.tracking.TrackingService;
import org.polytech.shipme.buisness.transporter.TransporterService;

public class DeliveryManagerImpl implements DeliveryManager {

    private PaymentService paymentService;
    private TransporterService transporterService;
    private TrackingService trackingService;
    private NotificationService notificationService;

    public DeliveryManagerImpl(PaymentService paymentService,
                               TransporterService transporterService,
                               TrackingService trackingService,
                               NotificationService notificationService) {
        this.paymentService = paymentService;
        this.transporterService = transporterService;
        this.trackingService = trackingService;
        this.notificationService = notificationService;
    }

    @Override
    public ShipmentResponse process(ShipmentRequest shipmentRequest) {

        try {
            paymentService.verifyPayment(shipmentRequest.getPaymentInfo());
            TrackingId trackingId = trackingService.initTracking();

            Itinerary itinerary = transporterService.send(
                    trackingId,
                    shipmentRequest.getStartingPoint(),
                    shipmentRequest.getDestination(),
                    shipmentRequest.getParcel(),
                    shipmentRequest.getFrom(),
                    shipmentRequest.getTo());

            notificationService.sendNotificationToRecipient(shipmentRequest.getTo(), trackingId, itinerary);
            notificationService.sendNotificationToSender(shipmentRequest.getFrom(), trackingId);
            return new ShipmentResponse(ShipmentResponseStatus.ACCEPTED, trackingId.getId());
        } catch (PaymentRefusedException e) {
            return new ShipmentResponse(ShipmentResponseStatus.PAYMENT_REFUSED);
        }
    }
}
