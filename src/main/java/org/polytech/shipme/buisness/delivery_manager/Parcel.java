package org.polytech.shipme.buisness.delivery_manager;

public class Parcel {
    ParcelType type;

    public Parcel() {
    }

    public Parcel(ParcelType type) {
        this.type = type;
    }

    public ParcelType getType() {
        return type;
    }

    public void setType(ParcelType type) {
        this.type = type;
    }
}

enum ParcelType {
    SMALL, MEDIUM, LARGE
}
