/*
 * How to find longest String from given array?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question20 
{

	public static void main(String[] args) 
	{
		String[] strArray = {"ram","shyam","niranjana","susanta"};
		
		//convert array to stream
		List<String> listString = Arrays.stream(strArray).collect(Collectors.toList());
		System.out.println(listString);
		String longestString = Arrays.stream(strArray).reduce((word1,word2)->word1.length() > word2.length() ? word1:word2).get();
		System.out.println("Longest String: "+longestString+" whose length is: "+longestString.length());
		
		
		
	}
}
