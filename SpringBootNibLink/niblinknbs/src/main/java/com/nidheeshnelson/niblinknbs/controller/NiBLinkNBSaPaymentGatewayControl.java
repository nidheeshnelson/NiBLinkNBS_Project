package com.nidheeshnelson.niblinknbs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSLists;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaiaLivePaymentServices;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaieShiftService;

@RestController
@CrossOrigin
@RequestMapping("/paymentgateway")
public class NiBLinkNBSaPaymentGatewayControl {
	@Autowired
	private NiBLinkNBSaiaLivePaymentServices ps;
	@Autowired
	private NiBLinkNBSaieShiftService ss;
	private List<NiBLinkNBSLists> nn = new ArrayList<>();
	@PostMapping("/amountpayable")
	public List<NiBLinkNBSLists> totalAmount(@RequestBody NiBLinkNBSgIDs id) {
		try {
		System.out.println(id);
		nn=ps.totalAmount(id);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return nn;
	}
	@PostMapping("/cardpay")
	public Map<String, String> cardPayment(NiBLinkNBSaLivePaymentModel pm) {
		System.out.println(pm);
		System.out.println(ss.shiftPayed(pm));
		return ps.cardPayment(pm);
	}
	@PostMapping("/netbank")
	public Map<String, String> netbankingPayment(NiBLinkNBSaLivePaymentModel pm){
		System.out.println(pm);
		System.out.println(ss.shiftPayed(pm));
		return ps.netbankingPayment(pm);
	}
	@PostMapping("/upipay")
	public Map<String, String> upiPayment(NiBLinkNBSaLivePaymentModel pm){
		System.out.println(pm);
		System.out.println(ss.shiftPayed(pm));
		return ps.upiPayment(pm);
	}
}
