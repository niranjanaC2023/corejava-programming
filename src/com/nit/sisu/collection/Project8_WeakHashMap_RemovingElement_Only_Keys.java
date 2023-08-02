package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project8_WeakHashMap_RemovingElement_Only_Keys {
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
		whm.put("x", null);
		System.out.println(whm.size());  //6
		System.out.println(whm);
		System.out.println();
//********removing one entries(Key):- public V remove(Object k)***********
		//remove(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is Value. 
		//So it returns "key's value",  if given "key" is present...and returns "null", if given "key" is not present..
		System.out.println(whm.remove("a")); //0
		System.out.println();
		System.out.println(whm.remove("sisu")); //null
		System.out.println();
		System.out.println(whm.remove(true)); //3
		System.out.println();
		System.out.println(whm.remove("null")); //null
		System.out.println();
		System.out.println(whm.remove(null)); //7
		System.out.println();
	}
}
