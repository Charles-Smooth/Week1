package com.ss.java.five;

import java.util.ArrayList;

public class Assignment4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(args.length);

		//replaceAll removes all the "x"s and replaces it with nothing
		Interface4 inf = (n) -> list.get(n).replaceAll("x", "");
		
		//add the values from the command line to the array
		for(int i =0; i<args.length; i++)
		{
			list.add(args[i]);
		}
		//prints out the contents of the list
		for(int i = 0; i<list.size(); i++)
		{
			System.out.print(inf.noX(i)+" ");
		}
	}

}
