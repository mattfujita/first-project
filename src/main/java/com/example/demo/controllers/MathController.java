package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.models.Adder;

@Controller
@RequestMapping({"/", "/math"}) //this is the base path for the controller, we NEED TO SPECIFY FOR ROUTING, we are appending this now in URL
public class MathController {

	//this points to http://localhost:8080/math/adder (this is a post mapping)
	@PostMapping("adder")
	public String addTwoNumbers(@RequestParam(name = "left") int first, @RequestParam(name = "right") double second,
			Model model) {
		Adder adder = new Adder(first, second);
		double result = adder.calculate();
		model.addAttribute("sum", result);
		return "mathematics/sum-result";
	}
	
	@GetMapping("adder") //user is typing in the URL directly
	public String adders() {
		return "mathematics/adder-form";
	}
}