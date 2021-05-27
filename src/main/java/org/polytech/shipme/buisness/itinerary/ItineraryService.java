package org.polytech.shipme.buisness.itinerary;


import org.polytech.shipme.buisness.delivery_manager.Address;

public interface ItineraryService {
    Itinerary calculateBestItinerary(Address startingPoint, Address destination);
}
