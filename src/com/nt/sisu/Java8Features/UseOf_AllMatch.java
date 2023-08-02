package com.nt.sisu.Java8Features;

import java.util.HashSet;
import java.util.Set;

public class UseOf_AllMatch {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("mango");
		fruits.add("pineaple");
		fruits.add("grapes");
		System.out.println(fruits);
		System.out.println();
		boolean result = 	fruits.stream().allMatch(i->i.startsWith("p"));
		System.out.println(result);           //false
		

	}

}
