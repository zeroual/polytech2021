package org.polytech.shipme.buisness.delivery_manager;


public class ShipmentRequest {

    private Address startingPoint;

    private Address destination;

    private Parcel parcel;

    private Sender from;

    private Recipient to;

    private PaymentInfo paymentInfo;

    public ShipmentRequest(Address startingPoint, Address destination, Parcel parcel, Sender from, Recipient to, PaymentInfo paymentInfo) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.parcel = parcel;
        this.from = from;
        this.to = to;
        this.paymentInfo = paymentInfo;
    }

    public Address getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Address startingPoint) {
        this.startingPoint = startingPoint;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public Sender getFrom() {
        return from;
    }

    public void setFrom(Sender from) {
        this.from = from;
    }

    public Recipient getTo() {
        return to;
    }

    public void setTo(Recipient to) {
        this.to = to;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}
