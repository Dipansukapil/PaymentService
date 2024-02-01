package com.paymentService.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Configuration
public class PaymentGatewayConfig {
	
	private String rayzorpayId = "add_rayzorpayId";
	private String rayzorpayKey = "add_rayzorpayKey";
	
	@Bean
	public RazorpayClient createRayzorpayClient() throws RazorpayException {
		return new RazorpayClient(rayzorpayId,rayzorpayKey);
	}

}
