package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex4")
public class Exam04Controller {

	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/ex4R")
	public String R(String name, String age, String come, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("come", come);
		return "exam04-result";
	}
	
}
