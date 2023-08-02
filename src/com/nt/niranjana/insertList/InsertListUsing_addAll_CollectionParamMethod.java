package com.nt.niranjana.insertList;//addAll(int index, Collection<? extends E> c): we can use this method to insert elements from a collection at the given index. 
								//All the elements in the list are shifted towards the right to make space for the elements from the collection.  
									

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertListUsing_addAll_CollectionParamMethod {

	public static void main(String[] args) {
		
		List<String> favFoodList = new ArrayList<String>();
		favFoodList.addAll(0,Arrays.asList("GolGapa","Biriyani","Jalebi"));
		favFoodList.addAll(1,Arrays.asList("Gulab Jamun","Makka","Dates","Choole","pakoda","Aluchop"));
		System.out.println("favFood list are: "+favFoodList);
		System.out.println("favFood list are: "+favFoodList.get(1));
	}
}
