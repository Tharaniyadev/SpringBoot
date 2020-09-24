package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StringConcatTest {
	
	StringConcat stringConcat = new StringConcat();

	@Test
	public void testWelcome() {
		 Assertions.assertEquals("Welcome",stringConcat.Welcome());
	}
	
	@Test
	public void testWelcomeName() {
		 Assertions.assertEquals("Welcome Priya",stringConcat.Welcome("Priya"));
	}
	
	@Test
	public void testWelcomeNameGreating() {
		 Assertions.assertEquals("Welcome Priya Good Morning",stringConcat.Welcome("Priya","Good Morning"));
	}
	
	@Test
	public void testWelcomeNameGreating2() {
		 Assertions.assertEquals("Welcome Priya Good Morning Have a Greet Day",stringConcat.Welcome("Priya","Good Morning","Have a Greet Day"));
	}
	
	@Test
	public void testWelcomeNum() {
		 Assertions.assertEquals("Please Enter String",stringConcat.Welcome("2"));
	}
	

}
