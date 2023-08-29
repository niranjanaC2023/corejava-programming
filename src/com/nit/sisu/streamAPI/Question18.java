/*
 * Write a program to find the first Non-Repeated and Repeated character in a String?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question18 
{

	public static void main(String[] args) 
	{
		String name = "ilovejavatechie";
		String[] data = name.split("");
		System.out.println(Arrays.toString(data));
		String  firstNonRepeatdCharacter = Arrays.stream(data).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
				entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		System.out.println("firstNonRepeatdCharacter: "+firstNonRepeatdCharacter);
		System.out.println();
		
		String name2 = "ilovejavatechie";
		String[] data2 = name.split("");
		System.out.println(Arrays.toString(data));
		String  firstRepeatdCharacter = Arrays.stream(data).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
				entrySet().stream().filter(x->x.getValue()>1).findFirst().get().getKey();
		System.out.println("firstRepeatdCharacter: "+firstRepeatdCharacter);
	}
}
