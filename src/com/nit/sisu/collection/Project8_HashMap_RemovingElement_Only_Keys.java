package com.nit.sisu.collection;

import java.util.HashMap;

public class Project8_HashMap_RemovingElement_Only_Keys {
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
//********removing one entries(Key):- public V remove(Object k)***********
		//remove(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is Value. 
		//So it returns "key's value",  if given "key" is present...and returns "null", if given "key" is not present..
		System.out.println(hm.remove("a")); //0
		System.out.println();
		System.out.println(hm.remove("sisu")); //null
		System.out.println();
		System.out.println(hm.remove(true)); //3
		System.out.println();
		System.out.println(hm.remove("null")); //null
		System.out.println();
		System.out.println(hm.remove(null)); //7
		System.out.println();
	}
}
