package com.pandiaaman.springboot2024refresher.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencytest")
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration currencyObj; //using this since we have an @component 
	
	@GetMapping("/get")
	public CurrencyServiceConfiguration getCurrencyConf() {
		return currencyObj;
	}
}
