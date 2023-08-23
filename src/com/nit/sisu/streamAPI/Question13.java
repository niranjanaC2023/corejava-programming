/*
 * How to count number of String from the String ArrayList in Java8?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question13 
{

	public static void main(String[] args) 
	{
		//List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		List<String> names = Arrays.asList("Raja ji Raja ji kab aoge Raja ji","am","am","AA", "BB", "AA", "CC");
		Map<String,Long> duplicateCount = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(duplicateCount);
       
	}
}
