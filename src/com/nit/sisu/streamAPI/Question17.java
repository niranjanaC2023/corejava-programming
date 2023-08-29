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
		
		//1st way
		Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str -> str,LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		
		//2nd way
		String ss = "educationn";
		List<Character> ch = ss.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
		System.out.println(ch);
		Map<Character, Long> chList = ch.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("chList"+chList);
		System.out.println();
		
		
		//3rd way
		String name = "Niranjana";
		String[] data = name.split("");
		System.out.println(Arrays.toString(data));
		Map<String,Long> characterCount = Arrays.stream(data).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(characterCount);
	}
}
