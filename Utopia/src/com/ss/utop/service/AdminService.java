package com.ss.utop.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.ss.utop.dao.AirplaneDAO;
import com.ss.utop.dao.AirplaneTypeDAO;
import com.ss.utop.dao.AirportDAO;
import com.ss.utop.dao.FlightDAO;
import com.ss.utop.dao.RouteDAO;
import com.ss.utop.entity.Flight;
import com.ss.utop.entity.Route;
import com.ss.utop.menu.Main;
import com.ss.utop.entity.Airport;
import com.ss.utop.entity.Airplane;
import com.ss.utop.entity.AirplaneType;

public class AdminService {
	ConnectionUtil connUtil = new ConnectionUtil();
//---------------- Airport ----------------------------------
	public void addNewAirport(Airport ap) throws SQLException			//create different methods to create stuff
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Airport temp = new Airport();
			temp.setAirportCode(ap.getAirportCode());
			temp.setCityName(ap.getCityName());
			AirportDAO adao = new AirportDAO(conn);
			
			adao.addAirport(temp);
			
			System.out.println("Added");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			System.out.println("Something went wrong. You might have added 2 of the same airport codes");
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection

			Main.run();						//calls the main menu run function to continue to run
		}
	}
	
	public void updateAirport(Airport ap) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Airport temp = new Airport();
			temp.setAirportCode(ap.getAirportCode());
			temp.setCityName(ap.getCityName());
			AirportDAO adao = new AirportDAO(conn);
			
			adao.updateAirport(temp);
			
			System.out.println("Updated");
			conn.commit();					//if it is all good, commit the changes

		}catch (Exception e)
		{
			System.out.println("Something went wrong. The airport code may not exist");
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}	
	
	public void deleteAirport(String code) throws SQLException
	{
		Connection conn = null;
		try {
			code = code.toUpperCase();
			conn = connUtil.getConnection();
			Airport temp = new Airport();
			temp.setAirportCode(code);
			AirportDAO adao = new AirportDAO(conn);

			
			adao.deleteAirport(temp);			
			
			System.out.println("Deleted");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}

	public void readAllAirports() throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			AirportDAO adao = new AirportDAO(conn);
			
			
			adao.getAllAirports();
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
//----------------- Airplane -----------------------------------------

	public void addNewAirplane(Airplane plane) throws SQLException {
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Airplane temp = new Airplane();
			temp.setAPId(plane.getAPId());
			temp.setType(plane.getType());
			
			AirplaneDAO apdao = new AirplaneDAO(conn);
			
			apdao.addAirplane(temp);
			
			System.out.println("Added");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			System.out.println("Something went wrong. You might have added 2 of the same airplane ID's");
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}		
	}
	
	public void updateAirplane(Airplane plane) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Airplane temp = new Airplane();
			temp.setAPId(plane.getAPId());
			temp.setType(plane.getType());
			AirplaneDAO apdao = new AirplaneDAO(conn);
			
			apdao.updateAirplane(temp);
			
			System.out.println("Updated");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			System.out.println("Something went wrong. The airport code may not exist");
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}	
	
	public void deleteAirplane(int id) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Airplane temp = new Airplane();
			temp.setAPId(id);
			AirplaneDAO apdao = new AirplaneDAO(conn);
			
			apdao.deleteAirplane(temp);			
			
			System.out.println("Deleted");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}

	public void readAllAirplanes() throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			AirplaneDAO apdao = new AirplaneDAO(conn);
			
			
			apdao.getAllAirplanes();
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
//----------------- Airplane Types -----------------------------------
	public void addNewAirplaneType(AirplaneType type) throws SQLException {
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			AirplaneType temp = new AirplaneType();
			
			temp.setCapacity(type.getCapacity());
			
			AirplaneTypeDAO apdao = new AirplaneTypeDAO(conn);
			
			apdao.addAirplaneType(temp);
			System.out.println("Added");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			System.out.println("Something went wrong. You might have added 2 of the same airplane ID's");
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}		
	}
	
	public void updateAirplaneType(AirplaneType type) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			AirplaneType temp = new AirplaneType();
			temp.setCapacity(type.getCapacity());

			AirplaneTypeDAO apdao = new AirplaneTypeDAO(conn);
			
			apdao.updateAirplaneType(temp);
			
			System.out.println("Updated");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			System.out.println("Something went wrong. The airport code may not exist");
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}	
	
	public void deleteAirplaneType(int id) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			AirplaneType temp = new AirplaneType();

			temp.setId(id);
			
			AirplaneTypeDAO apdao = new AirplaneTypeDAO(conn);
			
			apdao.deleteAirplaneType(temp);			
			
			System.out.println("Deleted");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}

	public void readAllAirplaneTypes() throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			AirplaneTypeDAO apdao = new AirplaneTypeDAO(conn);
			
			
			apdao.getAllAirplaneTypes();
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
//----------------- Flights ------------------------------------------	
	public void addNewFlight(Flight f) throws SQLException			//create different methods to create stuff
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Flight temp = new Flight();
			temp.setFlightId(f.getFlightId());
			temp.setRouteId(f.getRouteId());
			temp.setAirplaneId(f.getAirplaneId());
			temp.setDepartTime(f.getDepartTime());
			temp.setResSeats(f.getResSeats());
			temp.setPrice(f.getPrice());
			FlightDAO fdao = new FlightDAO(conn);
			
			fdao.addFlight(temp);
			
			conn.commit();					//if it is all good, commit the changes
			System.out.println("Added");
		}catch (Exception e)
		{
			System.out.println("Something went wrong when you tried to add the flight. Maybe a key doesn't exist or the flight ID already does");
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
	
	public void updateFlight(Flight f) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Flight temp = new Flight();
			temp.setFlightId(f.getFlightId());
			temp.setRouteId(f.getRouteId());
			temp.setAirplaneId(f.getAirplaneId());
			temp.setDepartTime(f.getDepartTime());
			temp.setResSeats(f.getResSeats());
			temp.setPrice(f.getPrice());
			FlightDAO fdao = new FlightDAO(conn);
			
			fdao.updateFlight(temp);
			
			
			System.out.println("Updated");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}	
	
	public void deleteFlight(int id) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Flight temp = new Flight();
			temp.setFlightId(id);
			FlightDAO fdao = new FlightDAO(conn);
			
			//call the delete function in the FlightDAO class
			fdao.deleteFlight(temp);			
			
			System.out.println("Deleted");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}

	public void readAllFlights() throws SQLException
	{
		Connection conn = null;
		try {			
			conn = connUtil.getConnection();
			FlightDAO fdao = new FlightDAO(conn);
			
			fdao.getAllFlights();
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
	
//--------------------- routes -----------------------
	public void addNewRoute(Route r) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Route temp = new Route();
			
			temp.setId(r.getId());
			temp.setOrgAirport(r.getDesAirport());
			temp.setDesAirport(r.getDesAirport());

			RouteDAO rdao = new RouteDAO(conn);
			
			rdao.addRoute(r);
			
			System.out.println("Added");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
	
	public void updateRoute(Route r) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Route temp = new Route();
			
			temp.setId(r.getId());
			temp.setOrgAirport(r.getDesAirport());
			temp.setDesAirport(r.getDesAirport());

			RouteDAO rdao = new RouteDAO(conn);
			
			rdao.updateRoute(temp);
			
			
			System.out.println("Updated");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}	
	
	public void deleteRoute(int id) throws SQLException
	{
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			Route temp = new Route();
			temp.setId(id);
			RouteDAO rdao = new RouteDAO(conn);
						
			rdao.deleteRoute(temp);			
			
			System.out.println("Deleted");
			conn.commit();					//if it is all good, commit the changes
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}	
	
	public void readAllRoutes(Route r) throws SQLException
	{
		Connection conn = null;
		try {		
			conn = connUtil.getConnection();
			RouteDAO rdao = new RouteDAO(conn);
			
			rdao.getAllRoutes();
		}catch (Exception e)
		{
			e.printStackTrace();	
			conn.rollback();				//if it fails, roll back
		}
		finally
		{
			conn.close();					//close connection
			Main.run();
		}
	}
}
