package org.polytech.shipme.buisness;

import java.time.LocalDate;

public class ShippingOffer {

    private Money price;
    private LocalDate estimatedDeliveryAt;

    public ShippingOffer(Money price, LocalDate estimatedDeliveryAt) {
        this.price = price;
        this.estimatedDeliveryAt = estimatedDeliveryAt;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public LocalDate getEstimatedDeliveryAt() {
        return estimatedDeliveryAt;
    }

    public void setEstimatedDeliveryAt(LocalDate estimatedDeliveryAt) {
        this.estimatedDeliveryAt = estimatedDeliveryAt;
    }
}
