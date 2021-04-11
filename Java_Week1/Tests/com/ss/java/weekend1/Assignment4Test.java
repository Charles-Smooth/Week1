package com.ss.java.weekend1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.java.five.Assignment4;

public class Assignment4Test {
	//test case with an input and good output and a bad output
	@Test
	public void noX()
	{
		List<String> input = Arrays.asList("ax", "bb", "Cx1@");
		List<String> output = Arrays.asList("a", "bb", "C1@");
		List<String> badOutput = Arrays.asList("afdax", "bdsfb", "Cx1@");
		
		assertEquals(output, Assignment4.noX(input));			//good
		assertNotEquals(badOutput, Assignment4.noX(input));		//bad
	}
} 