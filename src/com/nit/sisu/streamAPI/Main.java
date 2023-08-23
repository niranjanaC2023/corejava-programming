package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Integer> listOfInteger = Arrays.asList(1,10,3,8,8,2,13,13);
		List<Integer> desc = listOfInteger.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(desc);
	}

}
