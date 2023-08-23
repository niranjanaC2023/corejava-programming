/*
 * How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
 */


package com.nit.sisu.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Question15 
{

	public static void main(String[] args) 
	{
		List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        Optional.ofNullable(myList).filter(list -> !list.isEmpty()) // Check if the list is not empty
        .ifPresent(list -> list.forEach(System.out::println));
       
	}
}
