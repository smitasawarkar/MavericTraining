package com.theamleafspringboot.org.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class MyController {

	
	private List<String> friend = Arrays.asList("smita", "pooja", "samarth", "pratik", "amrita");

	private static  ArrayList<Employee> empList=new ArrayList<Employee>();

    static {

        empList.add(new Employee(1, "dinesh", 1234555));

        empList.add(new Employee(2, "suresh", 6784555));

        empList.add(new Employee(3, "ganesh", 2384555));

        empList.add(new Employee(4, "mangesh", 9084555));

        

    }

     //list.add("dinesh");

     
    @GetMapping("/employee")

    public String getEmployeeDeatils(Model model) {

        model.addAttribute("message","this message from Controller");

        model.addAttribute("friend",friend);
        model.addAttribute("empList",empList);
        

        return "Employee";

    }
	
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute Employee employee)
	 { 
		 ModelAndView modelAndView = new ModelAndView(); 
		 modelAndView.setViewName("saveEmployee");
	 modelAndView.addObject("employee", employee);
	 return modelAndView;
	 }
	 
}
