package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreAndGrade {
	
	
	@GetMapping("/Total/{Sub1}/{Sub2}/{Sub3}")
	public int Total(@PathVariable("Sub1") int Sub1, @PathVariable("Sub2") int Sub2, @PathVariable("Sub3") int Sub3)
	{
		return Sub1+Sub2+Sub3;
	}
	
	@GetMapping("/Avg/{Sub1}/{Sub2}/{Sub3}")
	public int Avg(@PathVariable("Sub1") int Sub1, @PathVariable("Sub2") int Sub2, @PathVariable("Sub3") int Sub3)
	{
		return (Sub1+Sub2+Sub3)/3;
	}
	
	@GetMapping("/Result/{Sub1}/{Sub2}/{Sub3}")
	public String Result(@PathVariable("Sub1") int Sub1, @PathVariable("Sub2") int Sub2, @PathVariable("Sub3") int Sub3)
	{
		if(Sub1>50 && Sub2 >50 && Sub3 >50)
		return "Pass";
		else
			return "Fail";
	}
	
	@GetMapping("/Grade/{Sub1}/{Sub2}/{Sub3}")
	public String Grade(@PathVariable("Sub1") int Sub1, @PathVariable("Sub2") int Sub2, @PathVariable("Sub3") int Sub3)
	{
		if(Sub1>80 && Sub2 >80 && Sub3 >80)
		return "A";
		else if(Sub1>70 && Sub2 >70 && Sub3 >70) 
			return "B";
		else if(Sub1>50 && Sub2 >50 && Sub3 >50) 
			return "C";
		else
			return "D";
	}
	
	@GetMapping("/Highest/{Sub1}/{Sub2}/{Sub3}")
	public int Highest(@PathVariable("Sub1") int Sub1, @PathVariable("Sub2") int Sub2, @PathVariable("Sub3") int Sub3)
	{
		if(Sub1>=Sub2 && Sub1>=Sub3)
		return Sub1;
		else if(Sub2>=Sub1 && Sub2>=Sub3)
			return Sub2;
		else
			return Sub3;
			
	}
	

}
