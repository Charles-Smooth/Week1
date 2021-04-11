package com.ss.java.five;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * this program will take in an int for the amount of calculations,
 * and 2 more ints. 1 will be a flag and the other the number to calculate
 * 1 is to see if it is even or odd
 * 2 is to see if it is prime or not
 * 3 is to see if it is a palindrome
 */

public class Assignment1
{
	//interface for the program
	public interface PerformOperation {
		
		boolean test(int n);
	}
	//this will check if the number is even or odd. Returns true if even
	public static PerformOperation isOdd()
	{
		return (n) -> (n%2) == 0;
	}
	//this will check if the number is prime or not
	//first looks to see if it is one and if so, return true.
	//next we divide the number by 2 because of how multiplying numbers works
	//i.e. 10/2+1 = 6. 
	//if the number is divisible by the iterator, it is not prime and returns false 
	public static PerformOperation isPrime()
	{
		return (n) -> {if(n ==1)
					   	{
							return true; 
					   	}
						for(int j = 2; j<n/2+1;j++)
						{
							if((n%j)==0)
							{
								return false;
							}
						}
						return true;
						};
	}
	//this will check if a number is a palindrome
	//we first have to get the right most digit so we can first set the nextNum to that digit
	//we then divide the passed in number by 10 so we can get the next right most digit.
	//doing mod 10 and divide by 10 is an easy way to get each individual number from a whole number
	public static PerformOperation isPalindrome()
	{
		return (n) -> { int originalNum = n, nextNum =0, remainder;
						while(n!=0)
						{
							remainder = n%10;
							nextNum = nextNum *10 + remainder;
							n = n/10;
						}
						if(originalNum == nextNum)
						{
							return true;
						}
						else
						{
							return false;
						}
						};
	}

	//the main program to run everything
	public static void main(String[] args)
	{
		//ask the user for how many calculations they want to do
		Scanner sc = new Scanner(System.in);
		
		try
		{
			//s will be the size of the array
			int s = sc.nextInt();
			//the array will have s amount of rows with 2 columns
			int[][] arr = new int[s][2];
			
			//here we will build the array of size s where the first number is the flag and the second is the value
			for (int i=0; i<s; i++)
			{
				
					int flag = sc.nextInt();
					int val  = sc.nextInt();
					arr[i][0] = flag;
					arr[i][1] = val;
			}

			//here we will loop through the array again to perform the calculations
			//NOTE this can all be done in the previous for loop but the sample output wanted the test cases together 
			for (int i=0; i<s; i++)
			{
				if(arr[i][0]==1)							//if flag is 1, do even or odd
				{
					if(isOdd().test(arr[i][1]))
					{
						System.out.println("EVEN");
					}
					else
					{
						System.out.println("ODD");
					}
				}
				else if(arr[i][0]==2)						//if flag is 2, do prime
				{
					if(isPrime().test(arr[i][1]))
					{
						System.out.println("PRIME");
					}
					else
					{
						System.out.println("NOT PRIME");
					}
				}
				else if(arr[i][0]==3)						//if flag is 3, do palindrome
				{
					if(isPalindrome().test(arr[i][1]))
					{
						System.out.println("PALINDROME");
					}
					else
					{
						System.out.println("NOT PALINDROME");
					}
				}
				else										//if the user entered a bad flag
				{
					System.out.println("The number "+arr[i][0]+" is not a valid flag");
				}
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("That is not a valid number");
		}
		//close the scanner object
		sc.close();
	}
} 