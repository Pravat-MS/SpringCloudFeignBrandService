package com.pravat.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandRestController {
	
	@GetMapping("/msg")
	public String getMsg() {
		return "FROM BRAND";
	}
	
	
	@GetMapping("/getBrandData")
	public String getBrandData() {
		return "FROM Brand";
		
	}

}
