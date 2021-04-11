 /**
 * 
 */
package com.ss.java.five;

/**
 * @author Charles Alms
 *
 */
public class Assignment5 {

	/**
	 * This program will calculate the values of an array to determine if they can be added to the target value
	 * If 2 or more adjacent numbers are together, either all or none have to be used
	 */	
	public static boolean groupSumClump(int start, int[] array, int target)
	{
		if(target == 0)										//if the target is 0, we dont need to add anything so true
		{
			return true;
		}
		if(start >= array.length)						//if the starting position is greater than the array size itself, it will be false
	 	{
			if(target == 0)								//this is needed in case the target is 0 and starting at the last element in the array
			{
				return true;
			}
			return false;
	 	}
		
		int i = start+1;								//i will be the starting position +1. +1 is needed or you get stack overflow exceptions
														//this is because it will not be able to advance to the next position without it
		for(;  i < array.length && array[start] == array[i]; i++);
 		//this is where we use recursion to call the sum function again.
 		//if at any point the array values equal the target value, we return true and stop
 		//we are checking here to see if the same numbers are adjacent to each other
		if(groupSumClump(i, array, target - ((i - start) * array[start])))
	 	{
	 		return true;
	 	}
	 	//if the for loop did not return anything, we will call the function again and move to the next position. 
	 	return groupSumClump(i, array, target);	
	} 	
}