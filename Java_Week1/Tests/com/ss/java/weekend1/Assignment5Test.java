package com.ss.java.weekend1;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.java.five.Assignment5;

public class Assignment5Test {
	
	@Test
	public void groupSumClump()
	{
		Assignment5 a = new Assignment5();
		int[] arr = {2, 4, 8};
		int[] arr2 = {1, 2, 4, 8, 1};
		int[] arr3 = {2, 4, 4, 8};
		
		assertTrue(a.groupSumClump(0, arr, 10));
		assertTrue(a.groupSumClump(0, arr2, 14));
		assertFalse(a.groupSumClump(0, arr3, 14));
	}
}