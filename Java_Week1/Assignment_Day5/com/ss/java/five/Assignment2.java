package com.ss.java.five;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {

    public static List<Integer> rightMostDigit(List<Integer> list) 
    {
        return list.stream().map((n) -> n % 10).collect(Collectors.toList());		//this will get the rightmost digit by doing mod 10
    }
}