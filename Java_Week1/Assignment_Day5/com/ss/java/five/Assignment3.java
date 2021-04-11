package com.ss.java.five;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {
	
	public static List<Integer> doubling(List<Integer> list) 
    {
        return list.stream().map((n) -> n * 2).collect(Collectors.toList());		//this will double the value
    }
}
