package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project1_WeakHashMap {
	public static void main(String[] args) {
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		System.out.println(whm.size()); //0
		System.out.println(whm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		whm.put("a",  0);
		System.out.println(whm.size()); //1
		System.out.println(whm);
		System.out.println();
		
		//proof: null raised inside sopln becoz Key, Value not there
	    	System.out.println(whm.put(9, 1 ));
			System.out.println(whm.size()); //2
			System.out.println(whm);
			System.out.println();
		//proof: it stored data as hashCode order not insertion order, not sorting order
		whm.put(6,  2);
		whm.put("c", 3);
		System.out.println(whm.size()); //4
		System.out.println(whm);
		System.out.println();
		//prof:- it allow to store null value..
		whm.put(null, 7);
		System.out.println(whm.size()); //5
		System.out.println(whm);
		System.out.println();
	   //proof: it allow to store duplicate Values(3 ,3)
		whm.put(true, 3);
		System.out.println(whm.size()); //6
		System.out.println(whm);
		System.out.println();
	   //proof: it allow to store duplicate KEY, it just replacement..So size remain same
		System.out.println(whm.put(true, 4)); //showing which value is change
		System.out.println(whm.size()); //6
		System.out.println(whm);
		System.out.println();
		//proof: allow multiple null as "Value"
		whm.put("x", null);
		whm.put("y", null);
		System.out.println(whm.size()); //8
		System.out.println(whm);
		System.out.println();
		
		
	}
}
