package com.dubuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BitBoardController {
	
	@GetMapping("/hello.html")
	public String[] hello() {
		return new String[] {"Hello", "World"};
	}

}
