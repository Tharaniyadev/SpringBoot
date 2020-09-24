package com;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ScoreAndGradeTest {
	
	ScoreAndGrade scoreGrade = new ScoreAndGrade();

	@Test
	public void testTotal() {
		 Assertions.assertEquals(300,scoreGrade.Total(100,100,100));
	}
	
	@Test
	public void testResult() {
		 Assertions.assertEquals("Pass",scoreGrade.Result(100,100,100));
	}
	
	@Test
	public void testGrade() {
		 Assertions.assertEquals("A",scoreGrade.Grade(100,90,100));
	}
	@Test
	public void testHighest() {
		 Assertions.assertEquals(100,scoreGrade.Highest(100,90,80));
	}
	
	@Test
	public void testPercentage() {
		 Assertions.assertEquals(96,scoreGrade.Avg(100,100,90));
	}
}
