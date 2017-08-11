package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Calculation;

@Controller
@RequestMapping({"/", "/Calculator"})
//this is the base path for the controller, we NEED TO SPECIFY FOR ROUTING, we are appending this now in URL
public class MathController {

	//this points to http://localhost:8080/calc (this is a post mapping)
	@PostMapping("calc")
	public String calcTwoNumbers(String math, @RequestParam(name = "left") int first, @RequestParam(name = "right") double second,
			Model model) {
		Calculation arithmetic = new Calculation(first, second);
		double result = 0;
		if(math.equals("add")) {
			result = arithmetic.addition();
		} else if(math.equals("sub")) {
			result = arithmetic.subtraction();
		} else if(math.equals("mult")) {
			result = arithmetic.multiplication();
		} else if(math.equals("divide")) {
			result = arithmetic.divide();
		} else if(math.equals("mod")) {
			result = arithmetic.modulus();
		} else {
			//must be exp
			result = arithmetic.exponent();
		}
		model.addAttribute("calculation", result);
		return "mathematics/calculation-result";
	}
	
	@GetMapping("calc") //user is typing in the URL directly
	public String mathing() {
		return "mathematics/calculation-form";
	}
}