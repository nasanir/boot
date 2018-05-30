package com.nasanir.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MainController {
	@RequestMapping(method=RequestMethod.GET,value="/{model}")
	@ResponseBody
	String home(){
		System.out.println("success");
		return "success";
	}
}
	