package com.ss.java.four;

/*
 * The purpose is to create a double lock with a singleton class
 */
public class Assignment1 {
	private static volatile Assignment1 instance;		
	
	private Assignment1() {}					//private constructor

	//this will lock critical section of code that creates instances of the class
	public static Assignment1 getInstance()	
	{
		if(instance == null)
		{
			synchronized (Assignment1.class)
			{
				if(instance == null){
					instance = new Assignment1();
				}
			}
		}
		return instance;
	}
}
