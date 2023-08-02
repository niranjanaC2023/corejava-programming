package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project1_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		System.out.println(lhm.size()); //0
		System.out.println(lhm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		lhm.put("a",  0);
		System.out.println(lhm.size()); //1
		System.out.println(lhm);
		System.out.println();		
		//proof: null raised inside sopln becoz Key, Value not there
	    	System.out.println(lhm.put(9, 1 ));
			System.out.println(lhm.size()); //2
			System.out.println(lhm);
			System.out.println();
		//proof: it stored data as hashCode order not insertion order, not sorting order
		lhm.put(6,  2);
		lhm.put("c", 3);
		System.out.println(lhm.size()); //4
		System.out.println(lhm);
		System.out.println();
		//prof:- it allow to store null value..
		lhm.put(null, 7);
		System.out.println(lhm.size()); //5
		System.out.println(lhm);
		System.out.println();
	   //proof: it allow to store duplicate Values(3 ,3)
		lhm.put(true, 3);
		System.out.println(lhm.size()); //6
		System.out.println(lhm);
		System.out.println();
	   //proof: it allow to store duplicate KEY, it just replacement..So size remain same
		System.out.println(lhm.put(true, 4)); //showing which value is change
		System.out.println(lhm.size()); //6
		System.out.println(lhm);
		System.out.println();
		//proof: allow multiple null as "Value"
		lhm.put("x", null);
		lhm.put("y", null);
		System.out.println(lhm.size()); //8
		System.out.println(lhm);
		System.out.println();
	}
}
