package org.polytech.shipme.buisness.itinerary;


import org.polytech.shipme.buisness.delivery_manager.Address;

public class ItineraryServiceImpl implements ItineraryService {
    @Override
    public Itinerary calculateBestItinerary(Address startingPoint, Address destination) {
        return new Itinerary();
    }
}
