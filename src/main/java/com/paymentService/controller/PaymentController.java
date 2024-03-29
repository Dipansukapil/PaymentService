package com.paymentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentService.dtos.InitiatePaymentRequestDto;
import com.paymentService.service.PaymentService;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	private PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		
		this.paymentService = paymentService;
	}
	
	@PostMapping("/")
	public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException,StripeException {
		
		return paymentService.initiatePayment(requestDto.getOrderId(), requestDto.getAmount(),
				requestDto.getPhoneNumber(), requestDto.getEmail());
	}

}
