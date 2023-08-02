package com.nt.niranjana.insertList; //addAll(Collection<? extends E> c): This method appends all the elements from the given collection to the end of the list. 
										//The order of insertion depends on the order in which the collection iterator returns them

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertListUsing_addAll_CollectionMethod {

	public static void main(String[] args) {
		
		List<String> favFoodList = new ArrayList<String>();
		favFoodList.addAll(Arrays.asList("GolGapa","Biriyani","Jalebi","Gulab Jamun","Makka","Dates","Choole","pakoda","Aluchop"));
		System.out.println("favFood list are: "+favFoodList);
		System.out.println("favFood list are: "+favFoodList.get(4));
	}
}
