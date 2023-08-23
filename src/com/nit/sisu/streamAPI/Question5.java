/*
 Given a list of integers, find the total number of elements present in the list using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Question5 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(15,8,49,25,98,32);
		
		//1st way
		long totalNumber = list.stream().count();
		System.out.println(totalNumber);
		

	}
}
