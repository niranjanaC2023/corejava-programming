package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project6_WeakHashMap_SearchingElement_Only_Keys {
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
//********searching for key:- public boolean containsKey(K k)***********
		//containskey(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is boolean. So it returns "true" , if given "key" is present...and returns "false", if given "key" is not present..
		System.out.println(whm.containsKey("a")); //true
		System.out.println();
		
		System.out.println(whm.containsKey("sisu")); //false
		System.out.println();
		System.out.println(whm.containsKey(true)); //true
		System.out.println();
		System.out.println(whm.containsKey("true")); //false
		System.out.println();
		
	}
}
