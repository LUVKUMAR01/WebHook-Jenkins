package com.example.Webhook_Jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hello")
	public String hellotest() {
		return "This is Hello World!!";
		
	}


}
