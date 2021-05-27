package org.polytech.shipme.buisness.payment;


import org.polytech.shipme.buisness.delivery_manager.PaymentInfo;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void verifyPayment(PaymentInfo paymentInfo) throws PaymentRefusedException {
        if(paymentInfo.getCreditCardNumber()==null){
            throw new PaymentRefusedException();
        }
    }
}
