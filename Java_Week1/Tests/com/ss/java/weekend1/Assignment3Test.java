package com.ss.java.weekend1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.java.five.Assignment3;

public class Assignment3Test {
	//test case with an input and good output and a bad output
	@Test
	public void doubling()
	{
		List<Integer> input = Arrays.asList(1, 2, 3);
		List<Integer> output = Arrays.asList(2, 4, 6);
		List<Integer> badOutput = Arrays.asList(1, 22, 93);
		
		assertEquals(output, Assignment3.doubling(input));			//good
		assertNotEquals(badOutput, Assignment3.doubling(input));	//bad
	}
} 