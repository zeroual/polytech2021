package org.polytech.shipme.buisness.payment;


import org.polytech.shipme.buisness.delivery_manager.PaymentInfo;

public interface PaymentService {
    void verifyPayment(PaymentInfo paymentInfo) throws PaymentRefusedException;
}
