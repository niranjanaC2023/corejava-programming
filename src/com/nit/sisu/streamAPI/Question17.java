/*
 * Write a program to print the count of each character in a String?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question17 
{

	public static void main(String[] args) 
	{
		String s = "string data to count each character";
		
		Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str -> str,LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		
		String ss = "educationn";
		List<Character> ch = ss.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
		System.out.println(ch);
		Map<Character, Long> chList = ch.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("chList"+chList);
	}
}
