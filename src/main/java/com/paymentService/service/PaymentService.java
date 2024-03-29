package com.paymentService.service;

import org.springframework.stereotype.Service;

import com.paymentService.paymentGateway.PaymentGateway;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

@Service
public class PaymentService {
	
	private PaymentGateway paymentGateway;
	
	public PaymentService(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	
	
	public String initiatePayment(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException,StripeException{
		
		return paymentGateway.generatePaymentLink(orderId, amount, phoneNumber, email);
	}

}
