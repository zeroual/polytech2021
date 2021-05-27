package org.polytech.shipme.buisness.best_offer;

import org.polytech.shipme.buisness.delivery_manager.ShipmentRequest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;

public class BestOffersService {
    public List<ShippingOffer> propose(ShipmentRequest shippingRequest) {
        return asList(new ShippingOffer(new Money(BigDecimal.valueOf(21), "EUR"), LocalDate.now().plusDays(2)),
                new ShippingOffer(new Money(BigDecimal.valueOf(17), "EUR"), LocalDate.now().plusDays(4)));
    }
}
