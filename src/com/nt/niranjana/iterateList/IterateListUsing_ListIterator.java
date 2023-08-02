package com.nt.niranjana.iterateList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//
//1. Simple For loop
//* 2. Enhanced For loop
//* 3. Iterator
//* 4. ListIterator
//* 5. While loop
//* 6. Iterable.forEach() util
//* 7. Stream.forEach() util

public class IterateListUsing_ListIterator 
{
	public static void main(String[] args) 
	{
		List<String> favFoodList = new ArrayList<String>();
		favFoodList.add("GolGapa"); //index 0
		favFoodList.add("Biriyani"); //index 1
		favFoodList.add("Jalebi"); //index 2
		favFoodList.add("Gulab Jamun"); //index 3
		favFoodList.add("Makka");  //index 4
		favFoodList.add("Dates");  //index 5
		favFoodList.add("Choole"); // index 6
		favFoodList.add("pakoda");  // index 7
		favFoodList.add("Aluchop"); // index 8
		
		// List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");
        
        System.out.println("ListIterator ...");
        ListIterator<String> crunchifyListIterator = favFoodList.listIterator();
        while (crunchifyListIterator.hasNext()) 
        {
            System.out.println(crunchifyListIterator.next());
        }
	}
}
