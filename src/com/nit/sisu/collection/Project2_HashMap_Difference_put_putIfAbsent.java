package com.nit.sisu.collection;

import java.util.HashMap;

public class Project2_HashMap_Difference_put_putIfAbsent {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println(hm.size()); //0
		System.out.println(hm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		hm.put("a",  0);
		hm.put(6,  2);
		hm.put("c", 3);
		hm.put(null, 7);
		hm.put(true, 3); 
		System.out.println(hm.size());  //5
		System.out.println(hm);
		System.out.println();
		hm.put(true, 4); 
		System.out.println(hm.size()); //5
		System.out.println(hm);
		System.out.println();

//*******Difference put() and putIfAbsent()******
		//if value is not there inside key then we can add value and return value
		System.out.println(hm.put("x", "Niranjana")); //x key not there
		System.out.println(hm.size()); //6
		System.out.println(hm);
		System.out.println();
		//if value is there inside key then old value overwritten by new value
		System.out.println(hm.put("x", "Niranjana charty")); // x key is already there
		System.out.println(hm.size()); //6
		System.out.println(hm);
		System.out.println();
		
		//if value is not there inside key then we can add value and return null
		System.out.println(hm.putIfAbsent("y", "Susanta")); //y key not there
	    System.out.println(hm.size()); //7
		System.out.println(hm);
		System.out.println();
		//if value is there inside key then old value value will be return
		hm.putIfAbsent("y", "Susanta charty");  //y key is already there
		System.out.println(hm.size()); //7
		System.out.println(hm);
		System.out.println();
		
		
	}
}
