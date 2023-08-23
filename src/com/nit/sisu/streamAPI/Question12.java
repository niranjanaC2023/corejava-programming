/*
 * How to use map to convert object into Uppercase in Java 8?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question12 
{

	public static void main(String[] args) 
	{
		List<String> letter = Arrays.asList("ab","bc");
		List<String> letterUpperCase = letter.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(letterUpperCase);
       
	}
}
