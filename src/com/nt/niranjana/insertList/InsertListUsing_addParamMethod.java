package com.nt.niranjana.insertList;    //add(int index, E element): inserts the element at the given index. 
										//The method throws IndexOutOfBoundsException if the given index is out of range.

import java.util.ArrayList;
import java.util.List;

public class InsertListUsing_addParamMethod 
{
	public static void main(String[] args) 
	{	
		List<String> favFoodList = new ArrayList<String>();
		favFoodList.add(0,"GolGapa"); //index 0
		favFoodList.add(1,"Biriyani"); //index 1
		favFoodList.add(2,"Jalebi"); //index 2
		favFoodList.add(3,"Gulab Jamun"); //index 3
		favFoodList.add(4,"Makka");  //index 4
		favFoodList.add(5,"Dates");  //index 5
		favFoodList.add(6,"Choole"); // index 6
		favFoodList.add(7,"pakoda");  // index 7
		favFoodList.add(8,"Aluchop"); // index 8
		
		System.out.println("favFood list are: "+favFoodList);
		System.out.println("favFood list are: "+favFoodList.get(7));
	}
}
