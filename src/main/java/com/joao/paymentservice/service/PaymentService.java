package com.joao.paymentservice.service;

import com.joao.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
