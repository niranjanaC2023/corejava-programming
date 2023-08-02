package com.nit.sisu.collection;

import java.util.HashMap;

public class Project1_HashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println(hm.size()); //0
		System.out.println(hm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		hm.put("a",  0);
		System.out.println(hm.size()); //1
		System.out.println(hm);
		System.out.println();
		
		//proof: null raised inside sopln becoz Key, Value not there
	    	System.out.println(hm.put(9, 1 ));
			System.out.println(hm.size()); //2
			System.out.println(hm);
			System.out.println();
		//proof: it stored data as hashCode order not insertion order, not sorting order
		hm.put(6,  2);
		hm.put("c", 3);
		System.out.println(hm.size()); //4
		System.out.println(hm);
		System.out.println();
		//prof:- it allow to store null value..
		hm.put(null, 7);
		System.out.println(hm.size()); //5
		System.out.println(hm);
		System.out.println();
	   //proof: it allow to store duplicate Values(3 ,3)
		hm.put(true, 3);
		System.out.println(hm.size()); //6
		System.out.println(hm);
		System.out.println();
	   //proof: it allow to store duplicate KEY, it just replacement..So size remain same
		System.out.println(hm.put(true, 4)); //showing which value is change
		System.out.println(hm.size()); //6
		System.out.println(hm);
		System.out.println();
		//proof: allow multiple null as "Value"
		hm.put("x", null);
		hm.put("y", null);
		System.out.println(hm.size()); //8
		System.out.println(hm);
		System.out.println();
		
		
	}
}
