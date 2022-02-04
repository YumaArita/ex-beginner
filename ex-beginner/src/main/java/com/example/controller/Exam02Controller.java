package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex2")
public class Exam02Controller {
	@Autowired
	private HttpSession session;
/*	@ModelAttribute
	public Exam02Form setF() {
		return new Exam02Form();
	}*/
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	@RequestMapping("/ex2R1")
	public String R1(Integer num1, Integer num2, Integer r) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		r = num1 * num2;
		session.setAttribute("r", r);
		return "exam02-result";
	}
	@RequestMapping("/ex2R2")
	public String  R2() {
		return "exam02result2";
	}
}
