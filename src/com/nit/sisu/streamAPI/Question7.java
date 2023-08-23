/*
 Given a list of integers, sort all the values present in it using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(15,8,49,25,98,32);
		
		//1st way
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println();
		
		list.stream().sorted().forEach(System.out::println); //this forEach() method returns void
		

	}
}
