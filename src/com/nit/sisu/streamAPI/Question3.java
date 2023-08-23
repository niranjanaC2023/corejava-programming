/*
How to find duplicate elements in a given integers list in java using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question3 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,10,8,8,49,25,98,32,32);
		
		//1st way
		Set<Integer> listed = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(listed);
		System.out.println();
		
		//2nd way
		Set<Integer> items = new HashSet<>();
		Set<Integer> listedd = list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
		System.out.println(listed);
		
		//3rd way
		Set<Integer> set = new HashSet();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

	}

}
