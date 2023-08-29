/*
 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		
		//1st way
		List<String> listed = list.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(listed);
		System.out.println();
		
		//2nd way
		list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println); //// forEach() method returns void

	}

}
