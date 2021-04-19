package com.ss.utop.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ss.utop.entity.Airplane;
import com.ss.utop.entity.AirplaneType;

public class AirplaneTest {
	
	@Test
	public void testGetID()
	{
		Airplane ap = new Airplane();
		assertNull(ap.getAPId());
		ap.setAPId(10);
		assertEquals(ap.getAPId(), 10.0, .0001);
		assertNotEquals(ap.getAPId(), 11.0, .0001);
	}
	
	@Test
	public void testSetID()
	{
		Airplane ap = new Airplane();
		assertNull(ap.getAPId());
		ap.setAPId(10);
		assertEquals(ap.getAPId(), 10.0, .0001);
		assertNotEquals(ap.getAPId(), 11.0, .0001);
	}
	
	@Test
	public void testGetType()
	{
		Airplane ap = new Airplane();
		assertNull(ap.getType().getCapacity());
		assertNotNull(ap.getType());
	}
	
	//need to create everything for the airplane type 
	@Test
	public void testSetType()
	{
		Airplane ap = new Airplane();
		AirplaneType at = new AirplaneType();
		at.setId(10);
		at.setCapacity(100);
		ap.setType(at);
		assertEquals(ap.getType(), at);
	}
}
