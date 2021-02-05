package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.PersonRepo;
import com.example.demo.model.Person;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepo pRepo;
	
	@RequestMapping("/")
	public String home() {
		
		return "person.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person p) {
		System.out.println("Id is "+p.getPid());
		pRepo.save(p);
		
		return "person.jsp";
	}
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int pId) {
		
		ModelAndView mv = new ModelAndView("person.jsp");
		Person p = pRepo.findById(pId).orElse(null);
		mv.addObject("Person",p);
		
		return mv;
	}
	
	

}
