/*
 * How to find second highest number and second lowest number from given array?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question19 
{

	public static void main(String[] args) 
	{
		int[] number = {9,11,27,25,29,2};
		
		Stream<Integer> ListOfInteger = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder());
		System.out.println("ListOfInteger: "+ListOfInteger.collect(Collectors.toList()));
		
		//second highest number
		Integer secondHighestNumber =Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondHighestNumber: "+secondHighestNumber);
		System.out.println();
		
		//second lowest number
		Integer secondLowestNumber =Arrays.stream(number).boxed().sorted().skip(1).findFirst().get();
		System.out.println("secondLowestNumber: "+secondLowestNumber);
		System.out.println();
		
		
		
	}
}
