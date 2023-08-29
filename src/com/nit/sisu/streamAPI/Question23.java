/*
 How to Sort() a List using Collection and Stream api
 */


package com.nit.sisu.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question23 
{

	public static void main(String[] args) 
	{
		List<Integer> number = new ArrayList<>(List.of(10,28,1,282,56));
		System.out.println("Numbers are: "+number);
		
		//Sorting using collections
		Collections.sort(number);  //Ascending
		System.out.println("Ascending Order using collection: "+number);
		System.out.println();
		Collections.reverse(number);  //Descending
		System.out.println("Descending Order using collection: "+number);
		
		//Sorting using Stream API
		number.stream().sorted().forEach(System.out::println);  //Ascending
		System.out.println();
		number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);  //Descending

	}

}
