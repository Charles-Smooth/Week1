package com.ss.java.weekend1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.java.five.Assignment2;

public class Assignment2Test {
	//test case with an input and good output and a bad output
	@Test
	public void rightDigit()
	{
		List<Integer> input = Arrays.asList(1, 22, 93);
		List<Integer> output = Arrays.asList(1, 2, 3);
		List<Integer> badOutput = Arrays.asList(1, 22, 93);
		
		assertEquals(output, Assignment2.rightMostDigit(input));		//good	
		assertNotEquals(badOutput, Assignment2.rightMostDigit(input));	//bad
	}
} 