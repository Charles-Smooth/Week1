package com.ss.java.five;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment4 {

	public static List<String> noX(List<String> list) 
    {
        return list.stream().map((n) -> n.replace("x", "")).collect(Collectors.toList());		//this will remove x from the string
    }
}