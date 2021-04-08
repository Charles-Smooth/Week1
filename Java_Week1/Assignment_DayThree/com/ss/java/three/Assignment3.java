/**
 * 
 */
package com.ss.java.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Charles Alms
 *
 */
public class Assignment3 {

	/**
	 * This program will count all the characters given by the command line.
	 * Command line input: first the file path, then the character to find
	 */
	public static void main(String[] args) {
		String find = args[1];					//get the character you want to find
		Integer count = 0;						
		String character ="";
		String[] line = null;					//array for the lines
		
		try {
			File f = new File(args[0]);
			FileReader read = new FileReader(f);
			BufferedReader buff = new BufferedReader(read);			//need buffer for picking out each word/letter
			
			while((character=buff.readLine()) !=null)
			{
				//this if statement is to find words in a file
				if(find.length()>1)
				{
					line=character.split(" ");						//add the word to the array
				}
				//otherwise you can find single characters 
				else
				{
					line=character.split("");						//add the letter to the array
				}
				//loop through the array and see if you have the find value in it
				for(String word : line)
				{
					if(word.equals(find))
					{
						count++;
					}
				}
			}			
			System.out.println("Found "+count+" instances of \""+find+"\"");
			read.close();
		}
		catch (IOException e)
		{
			System.out.println("File not found");
		}
		//I noticed that having 1 argument crashes so this will help with that or any other error 
		catch (Exception b)
		{
			System.out.println("Unknown error has occured. Make sure you have both file and a character you wish to find");
		}
	}

}
