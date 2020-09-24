package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringConcat {
	String WelcomeMsg = "Welcome";
	
	@GetMapping("/Welcome")
	public String Welcome()
	{
		return WelcomeMsg;
	}
	
	@GetMapping("/Welcome/{Name}")
	public String Welcome(@PathVariable("Name") String Name)
	{
		if(Name.matches("^\\d+(\\.\\d+)?"))
		{
			return "Please Enter String"; 
		
		}
		else
		{
			return WelcomeMsg+" "+Name;
		}
	}
	
	@GetMapping("/Welcome/{Name}/{Greetings}")
	public String Welcome(@PathVariable("Name") String Name, @PathVariable("Greetings") String Greetings)
	{
		
		return WelcomeMsg+" "+Name+" "+Greetings;
	}
	
	@GetMapping("/Welcome/{Name}/{Greetings}/{Greeting2}")
	public String Welcome(@PathVariable("Name") String Name, @PathVariable("Greetings") String Greetings,@PathVariable("Greeting2") String Greeting2)
	{
		
		return WelcomeMsg+" "+Name+" "+Greetings+ " "+Greeting2;
	}
	
	/*@GetMapping("/Welcome/{num}")
	public String Welcome(@PathVariable("num") int num)
	{
		
		return "Please Enter String";
	}*/
	

}
