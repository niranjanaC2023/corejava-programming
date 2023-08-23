/*
 Given a list of integers, sort all the values present in it in descending order using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(15,8,49,25,98,32);
		
		//1st way
		List<Integer> descendingOrder = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()); // Comparator for descending order
		System.out.println(descendingOrder);
		System.out.println();
		
		
		//2nd way
		List<Integer> descendingOrder2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder2);
		

	}
}
