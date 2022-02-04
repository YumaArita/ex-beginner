package com.example.controller;



import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex3")
public class Exam03Controller {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/ex3R")
	public String R(Integer num1, Integer num2, Integer num3) {
		int nasi = num1 + num2 + num3;
		int ari = (int)((num1 + num2 + num3) * 1.1);
		
		application.setAttribute("nasi", nasi);
		application.setAttribute("ari", ari);
		return "exam03-result";
	}
	
}
