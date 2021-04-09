package com.ss.java.week1_Tests;

import com.ss.java.four.Assignment1;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class SingletonTest {
	@Test
	public void getInstance()								//test said this must be public
	{
		Assignment1 test = Assignment1.getInstance();		//must be the same object as the class
		assertNotNull(test);
	}
}
