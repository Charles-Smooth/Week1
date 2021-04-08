/**
 * 
 */
package com.ss.java.three;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Charles Alms
 *
 */
public class Assignment2 {

	/**
	 * This program will append text to an existing Java file
	 */
	public static void main(String[] args){
		String text = " This program was created by Charles on 4/7/21";		//simple message
		//try to open the file and throw exception if not found
		try {
			File f = new File(args[0]);								//file is the first argument in the command line 
			FileWriter newFile = new FileWriter(f, true);			//true means to append the data
			BufferedWriter buff = new BufferedWriter(newFile);		//create a buffer with the same data as the original file
			
			buff.write(text);										//append the text
			buff.close();											//make sure to close the file
			System.out.println("All done");
		}
		catch (IOException e)
		{
			System.out.println("File not found");
		}
	}

}
