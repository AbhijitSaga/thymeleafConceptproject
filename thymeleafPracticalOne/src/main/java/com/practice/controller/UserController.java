package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/about1")
	public String about(Model model) {
System.out.println("hvahvhv");
		model.addAttribute("name", "pankaj kumar");
		model.addAttribute("date", new Date().toString());
		return "about" ;

	}
	
	//iterator handling
	@GetMapping("/exampe-loop")
	public String iteratorHandler(Model model) {
	List<String> names=	List.of("ankita", "raman", "rahman", "suraj");
		model.addAttribute("name",names);
		return "iterate";
		
	}
	
	//handler for condition statements
	@GetMapping("/condition")
	public String conditonHandler(Model model) {
		System.out.println("conditional handler executed..");
		model.addAttribute("isActive",false);
		model.addAttribute("gender","F");
		
		List<Integer> list=List.of(233,34,21,49);
		model.addAttribute("myList", list);
		return "condition";
		
	}
	//handler for including fragments
	@GetMapping("/service")
	public String serviceHandler(Model model) {
		model.addAttribute("title","i like to eat somosa");
		model.addAttribute("subtitle","LocalDateTime.now().toString()");
		return "service";
	}
	//for new about
	@GetMapping("/aboutnew")
	public String newAbout() {
		
		return "aboutnew";
	} 
	
	
	}
