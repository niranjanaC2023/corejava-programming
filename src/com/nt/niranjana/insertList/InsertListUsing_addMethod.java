package com.nt.niranjana.insertList;        //add(E e): appends the element at the end of the list

import java.util.ArrayList;
import java.util.List;

public class InsertListUsing_addMethod 
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
		
		System.out.println("favFood list are: "+favFoodList);
		System.out.println("favFood list are: "+favFoodList.get(4));
	}
}
