package com.pandiaaman.springboot2024refresher.practice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//say there is a currency service, and we want to set up different properties for it
//for different profiles like dev, qa and prod

@ConfigurationProperties(prefix = "currency-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component //we want spring to manage this
public class CurrencyServiceConfiguration {
	
	//we configure below properties in the application.propeties file in resources folder
	private String url;
	private String username;
	private String key;

}
