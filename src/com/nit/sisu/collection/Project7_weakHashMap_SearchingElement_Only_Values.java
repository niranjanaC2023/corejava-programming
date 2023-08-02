package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project7_weakHashMap_SearchingElement_Only_Values {
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
//********searching for values :- public boolean containsValue(V v)***********
		//containsValue(-) method is working on "value" based searching...
		//"value" based searching means :- it used for only equals() method..
		//This method return type is boolean. So it returns "true" , if given "value" is present...and returns "false", if given "value" is not present..
		System.out.println(whm.containsValue("a")); //false
		System.out.println();
		System.out.println(whm.containsValue("3")); //false
		System.out.println();
		System.out.println(whm.containsValue(0)); //true
		System.out.println();
		System.out.println(whm.containsValue("null")); //false
		System.out.println();
		System.out.println(whm.containsValue(null)); //true
		System.out.println();
		
		
		
		
		
	}
}
