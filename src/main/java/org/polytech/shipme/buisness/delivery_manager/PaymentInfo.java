package org.polytech.shipme.buisness.delivery_manager;

public class PaymentInfo {
    private String creditCardNumber;

    public PaymentInfo(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public PaymentInfo() {
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
