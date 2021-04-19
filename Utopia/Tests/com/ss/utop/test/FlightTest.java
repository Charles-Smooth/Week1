package com.ss.utop.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.utop.entity.Airplane;
import com.ss.utop.entity.Flight;
import com.ss.utop.entity.Route;

public class FlightTest {
	
	@Test
	public void testGetId()
	{
		Flight f = new Flight();
		f.setFlightId(10);
		assertEquals(f.getFlightId(), 10.0, .0001);
	}
	
	@Test
	public void testSetId()
	{
		Flight f = new Flight();
		f.setFlightId(10);
		assertEquals(f.getFlightId(), 10.0, .0001);
	}
	
	@Test
	public void testGetRID()
	{
		Flight f = new Flight();
		Route r = new Route();
		r.setId(20);
		f.getRouteId().setId(r.getId());
		assertNotEquals(f.getRouteId(), r.getId());
	}
	
	@Test
	public void testSetRID()
	{
		Flight f = new Flight();
		Route r = new Route();
		r.setId(20);
		f.getRouteId().setId(r.getId());
		assertNotEquals(f.getRouteId(), r.getId());
	}
	
	@Test
	public void testGetAId()
	{
		Flight f = new Flight();
		Airplane ap = new Airplane();
		ap.setAPId(20);
		f.getAirplaneId().setAPId(ap.getAPId());
		assertNotEquals(f.getAirplaneId(), ap.getAPId());
	}
	
	@Test
	public void testSetAId()
	{
		Flight f = new Flight();
		Airplane ap = new Airplane();
		ap.setAPId(20);
		f.getAirplaneId().setAPId(ap.getAPId());
		assertNotEquals(f.getAirplaneId(), ap.getAPId());
	}
	
	@Test
	public void testGetTime()
	{
		Flight f = new Flight();
		f.setDepartTime("2021-04-17 10:00:00");
		assertEquals("2021-04-17 10:00:00", f.getDepartTime());
	}
	
	@Test
	public void testSetTime()
	{
		Flight f = new Flight();
		f.setDepartTime("2021-04-17 10:00:00");
		assertEquals("2021-04-17 10:00:00", f.getDepartTime());
	}
	
	@Test
	public void testGetSeats()
	{
		Flight f = new Flight();
		f.setResSeats(10);
		assertEquals(f.getResSeats(), 10.0, .0001);
	}
	
	@Test
	public void testSetSeats()
	{
		Flight f = new Flight();
		f.setResSeats(10);
		assertEquals(f.getResSeats(), 10.0, .0001);
	}
	
	@Test
	public void testGetPrice()
	{
		Flight f = new Flight();
		f.setPrice((float) 20.02);
		assertEquals(f.getPrice(), 20.02, .0001);
	}
	
	@Test
	public void testSetPrice()
	{
		Flight f = new Flight();
		f.setPrice((float) 20.02);
		assertEquals(f.getPrice(), 20.02, .0001);
	}
}
