package com.springboot.org;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Component {

	@RequestMapping("/greeting")
	public Greeting getMessage()
	{
		return new Greeting(1,"Smita");
	}
	
	@RequestMapping("/records")
	public ArrayList<Greeting> getGreetings(){
		ArrayList<Greeting> gList=new ArrayList<Greeting>();
		gList.add(new Greeting(1,"Good Morning"));
		gList.add(new Greeting(2,"Good Afternoon"));
		gList.add(new Greeting(3,"Good Evening"));
		gList.add(new Greeting(4,"Good Night"));
		
		return gList;
		
		
	}
	
	
}
