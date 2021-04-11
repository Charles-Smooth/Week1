package com.ss.java.week1_Tests;

import java.util.ArrayList;
import java.util.List;
/*
 * This program will take input from the user via command line as ints and print out the right most number
 */
public class rightMostDiget {

	public static void main(String[] args) {
		//array list to hold the numbers the user has entered
		ArrayList<Integer> rightDigit = new ArrayList<Integer>(args.length);
		List<Integer> newRightDigit = new ArrayList<Integer>(args.length);
		int counter =0;
		
		if(args.length>0)
		{
			//for loop to add all the numbers to the array list
			for(int i =0; i<args.length; i++)
			{
				//we will want to try to see if the user typed numbers
				try 
				{
					//checks to see if the number is positive
					if(new Integer(args[i]) >-1)
					{
						//need to cast "new Integer" since args is a String 
						rightDigit.add(new Integer(args[i]));
					}
				}
				//if the user typed a non integer, add 1 to the counter
				//this will allow the program to continue with the errors
				catch (NumberFormatException e)
				{
					counter++;
				//	System.out.println("Please add only positive numbers to the command line");			
				}
			}
			//rightDigit.forEach((n) -> {System.out.print((n%10) + " ");});
			
			//call the array list with a for each loop, add the value to the new array list at 
			//the Nth position doing mod 10. Mod 10 ensures that we get the right most number
			//11/10 is 1 with a remainder of 1			
			rightDigit.forEach((n) -> newRightDigit.add(n%10));
			System.out.println("done");

			//rightDigit.forEach((n) -> rightDigit.set(n, rightDigit.get(n)%10));

			/*for(int i =0; i<rightDigit.size(); i++)
			{
				//rightDigit.set(i, rightDigit.get(i)%10);
				System.out.print(rightDigit.get(i)+" ");
			}*/
			
			
			
			//this is for some feed back to the user
			//if the user had at least 1 bad argument, print the feed back and how many there were
			if(counter>0)
			{
				System.out.println("\nFound "+counter+" bad arguments");
				System.out.println("Please add only positive numbers to the command line next time");	
			}
		}
		//if the user didn't add at least 1 item
		else
		{
			System.out.println("Please add at least 1 item to the command line next time");
		}
	}

}
