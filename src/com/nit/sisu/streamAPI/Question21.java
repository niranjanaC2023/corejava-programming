/*
 Given a Array of integers, find out all the numbers starting with 1 using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question21 
{

	public static void main(String[] args) 
	{
		int[] number = {8,12,23,82,1,23};
		
		//1st way
		List<String> numberStartsWith1 = Arrays.stream(number).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println("numberStartsWith1:"+numberStartsWith1);
		System.out.println();

	}

}
