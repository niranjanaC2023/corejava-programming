/*
 * Java 8 program to perform cube on list elements and filter numbers greater than 50.
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 
{

	public static void main(String[] args) 
	{
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		
		List<Integer> morethan50AfterCube = integerList.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
		System.out.println(morethan50AfterCube);
       
	}
}
