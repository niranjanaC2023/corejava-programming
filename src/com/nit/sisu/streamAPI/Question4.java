/*
 Given the list of integers, find the first element of the list using Stream functions?
 */


package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question4 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(15,8,49,25,98,32);
		
		//1st way
		list.stream().findFirst().ifPresent(System.out::println); //return type void
		System.out.println();
		
		//2nd way
		Optional<Integer> firstElement = list.stream().findFirst();
		if(firstElement.isPresent())
		{
			System.out.println("First element: " + firstElement.get());
		}
		else 
		{
            System.out.println("List is empty");
        }


	}

}
