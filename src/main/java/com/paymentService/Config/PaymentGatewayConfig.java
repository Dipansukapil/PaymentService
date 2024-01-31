package com.paymentService.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Configuration
public class PaymentGatewayConfig {
	
	private String rayzorpayId = "rzp_test_tMULNFXbYXuxVU";
	private String rayzorpayKey = "ALtfCB9ursIVU0TWbGYq61vV";
	
	@Bean
	public RazorpayClient createRayzorpayClient() throws RazorpayException {
		return new RazorpayClient(rayzorpayId,rayzorpayKey);
	}

}
