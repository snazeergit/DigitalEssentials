package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator2 {
	@Autowired
	private LocalDateTime ldt;
	
	
	//Comment this and uncomment bean tag in cfg file
	@Bean(name = "ldt")
	public LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}

	public String getWishMessage() {
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Eveing";
		else
			return "Good Night";
	}
}
