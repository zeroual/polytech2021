package org.polytech.shipme.buisness.transporter;


import org.polytech.shipme.buisness.delivery_manager.Address;
import org.polytech.shipme.buisness.delivery_manager.Parcel;
import org.polytech.shipme.buisness.delivery_manager.Recipient;
import org.polytech.shipme.buisness.delivery_manager.Sender;
import org.polytech.shipme.buisness.itinerary.Itinerary;
import org.polytech.shipme.buisness.itinerary.ItineraryService;
import org.polytech.shipme.buisness.tracking.TrackingId;

public class TransporterServiceImpl implements TransporterService {


    private ItineraryService itineraryService;

    public TransporterServiceImpl(ItineraryService itineraryService) {
        this.itineraryService = itineraryService;
    }

    @Override
    public Itinerary send(TrackingId trackingId, Address startingPoint, Address destination, Parcel parcel, Sender from, Recipient to) {

        return itineraryService.calculateBestItinerary(startingPoint, destination);
    }
}
