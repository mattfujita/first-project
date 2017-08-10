package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Adder;
import com.example.demo.models.Whisper;
import com.example.demo.models.Yeller;

@Controller
@RequestMapping({"/", "/HelloWorld"})
public class HelloWorldController {
	
	private String title;
	
	public HelloWorldController() {
		title = "Hello Java and Spring!";
	}
	
	
	//this method isn't dynamic, it's just sending a request to show the site to the user, the HTML file to the user
	@GetMapping("")
	public String index() {
		return "helloworld/index";
	}
	
	@GetMapping("message") //this is the URL which the form submits
	public ModelAndView message(@RequestParam(required=false, defaultValue="«silence»") String message) {
		Yeller yell = new Yeller(message);
		String yellResult = yell.allCaps();
		ModelAndView mv = new ModelAndView("helloworld/message");
		
		//the path src/main/resources/templates/helloworld/message.html
		mv.addObject("title", title);
		mv.addObject("message", yellResult);
		return mv;
	}
	
	@GetMapping("whisper")
	public ModelAndView whisper(@RequestParam(required=false, defaultValue="<<shhhh>>") String message) {
		Whisper shoosh = new Whisper(message);
		String whisperResult = shoosh.allLower();
		ModelAndView mv = new ModelAndView("helloworld/message");
		
		//below code sends objects back to the browser
		mv.addObject("title", title);
		mv.addObject("message", whisperResult);
		return mv;
	}
	 
	@PostMapping("adder")
	public String addTwoNumbers(@RequestParam(name="left") int first, @RequestParam(name="right") double second, Model model) {
		Adder adder = new Adder(first, second);
		double result = adder.calculate();
		model.addAttribute("sum", result);
		return "helloworld/sum-result";
	}
	
}
