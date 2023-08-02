package com.nit.sisu.collection;

import java.util.HashMap;

public class Project6_HashMap_SearchingElement_Only_Keys {
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
		hm.put("x", null);
		System.out.println(hm.size());  //6
		System.out.println(hm);
		System.out.println();
//********searching for key:- public boolean containsKey(K k)***********
		//containskey(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is boolean. So it returns "true" , if given "key" is present...and returns "false", if given "key" is not present..
		System.out.println(hm.containsKey("a")); //true
		System.out.println();
		
		System.out.println(hm.containsKey("sisu")); //false
		System.out.println();
		System.out.println(hm.containsKey(true)); //true
		System.out.println();
		System.out.println(hm.containsKey("true")); //false
		System.out.println();
		
	}
}
