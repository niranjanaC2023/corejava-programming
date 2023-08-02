package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project2_WeakHashMap_Difference_put_putIfAbsent {
	public static void main(String[] args) {
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		System.out.println(whm.size()); //0
		System.out.println(whm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		whm.put("a",  0);
		whm.put(6,  2);
		whm.put("c", 3);
		whm.put(null, 7);
		whm.put(true, 3); 
		System.out.println(whm.size());  //5
		System.out.println(whm);
		System.out.println();
		whm.put(true, 4); 
		System.out.println(whm.size()); //5
		System.out.println(whm);
		System.out.println();

//*******Difference put() and putIfAbsent()******
		//if value is not there inside key then we can add value and return value
		System.out.println(whm.put("x", "Niranjana")); //x key not there
		System.out.println(whm.size()); //6
		System.out.println(whm);
		System.out.println();
		//if value is there inside key then old value overwritten by new value
		System.out.println(whm.put("x", "Niranjana charty")); // x key is already there
		System.out.println(whm.size()); //6
		System.out.println(whm);
		System.out.println();
		
		//if value is not there inside key then we can add value and return null
		System.out.println(whm.putIfAbsent("y", "Susanta")); //y key not there
	    System.out.println(whm.size()); //7
		System.out.println(whm);
		System.out.println();
		//if value is there inside key then old value value will be return
		whm.putIfAbsent("y", "Susanta charty");  //y key is already there
		System.out.println(whm.size()); //7
		System.out.println(whm);
		System.out.println();
		
		
	}
}
