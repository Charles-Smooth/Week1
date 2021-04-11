package com.ss.java.five;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment6 {

	public static class SampleSingleton
	{
		private static Connection conn = null;
		private static volatile SampleSingleton instance = null;		//added volatile to prevent cache issues
		
		private SampleSingleton() {}				//the default constructor
		
		public static SampleSingleton getInstance()						//create a double lock for the sample singleton
		{																//this helps boost performance since we do not need to check every single time
			if(instance == null)										//first we can check if we need to create the object
			{
				synchronized (SampleSingleton.class)					//locks the instance 
				{
					if(instance == null)								//our double check/lock
					{
						instance = new SampleSingleton();
					}
				}
			}
			return instance;
		}
		
		public static void databaseQuery(BigDecimal input) throws SQLException
		{
			try																//added a try catch because the database or select statement could be bad
			{
				conn = DriverManager.getConnection("url of database");		//location of the database
				Statement st = conn.createStatement();						//
				ResultSet rs = st.executeQuery("select id from table");		//query statement selecting the id "id" from the table "table"
				int x =0; 
				
				//since you can not do int*BigDecimal, create a new BigDecimal number
				//total will be the total of the input * x
				BigDecimal total;
				
				while(rs.next())					//while there are more records in the table, move onto the next one
				{
					x = rs.getInt(1);				//we will first set x to the value of the id from the query
					 
					total = input.multiply(new BigDecimal(x));		//total is not the x value (id) * the input 
				}
			}
			catch (SQLException e)
			{
				System.out.println("Database or query statement can not be completed");
			}
		}
	}

}
