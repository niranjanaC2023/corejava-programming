/*
 * How to find only duplicate elements with its count from the String ArrayList in Java8?
 */


package com.nit.sisu.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question14 
{

	public static void main(String[] args) 
	{
		String s = "ram is a boy ram is a boy ram is a boy";
		List<String> list = Arrays.asList(s.split(" "));
		System.out.println(list);
		Map<String, Long> mapList = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("mapList: "+mapList);
		System.out.println();
		
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
		Map<String, Long> map = myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("map: "+map);
		System.out.println();
		
	}
}
