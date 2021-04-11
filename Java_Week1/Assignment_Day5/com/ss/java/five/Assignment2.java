package com.ss.java.five;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
		//array list to hold the numbers the user has entered
		ArrayList<Integer> list = new ArrayList<Integer>(args.length);
		int counter =0;
		
		//Interface2 object that computes the mod 10
		Interface2 inf = (n) -> list.get(n)%10;
		
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
						list.add(new Integer(args[i]));
					}
				}
				//if the user typed a non integer, add 1 to the counter
				//this will allow the program to continue with the errors
				catch (NumberFormatException e)
				{
					counter++;
				}
			}
			//prints out the contents of the list
			for(int i = 0; i<list.size(); i++)
			{
				System.out.print(inf.rightDigit(i)+" ");
			}

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
