/*
 Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		
		//1st way
		List<Integer> listed = list.stream().filter(n->n%2 == 0).collect(Collectors.toList());
		System.out.println(listed);
		System.out.println();
		
		//2nd way
		list.stream().filter(n->n%2 == 0).forEach(System.out::println);  //this forEach() method returns void

		
	}

}
