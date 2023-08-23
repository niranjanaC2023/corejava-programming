/*
 Given a list of integers, find the maximum value element present in it using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Question6 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(15,8,49,25,98,32);
		
		//1st way
		long maxNumber = list.stream().max(Integer::compare).get();
		System.out.println(maxNumber);
		

	}
}
