package com.nidheeshnelson.niblinknbs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaiaLivePaymentServices;

@RestController
@CrossOrigin
@RequestMapping("/paymentgateway")
public class NiBLinkNBSaPaymentGatewayControl {
	@Autowired
	private NiBLinkNBSaiaLivePaymentServices ps;
	@PostMapping("/amountpayable")
	public double totalAmount(@RequestBody NiBLinkNBSgIDs id) {
		System.out.println(id);
		return ps.totalAmount(id);
	}
	public Map<String, String> cardPayment(NiBLinkNBSaLivePaymentModel pm) {
		return null;
	}
}
