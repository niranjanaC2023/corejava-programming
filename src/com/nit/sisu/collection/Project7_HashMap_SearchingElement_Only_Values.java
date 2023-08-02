package com.nit.sisu.collection;

import java.util.HashMap;

public class Project7_HashMap_SearchingElement_Only_Values {
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
//********searching for values :- public boolean containsValue(V v)***********
		//containsValue(-) method is working on "value" based searching...
		//"value" based searching means :- it used for only equals() method..
		//This method return type is boolean. So it returns "true" , if given "value" is present...and returns "false", if given "value" is not present..
		System.out.println(hm.containsValue("a")); //false
		System.out.println();
		System.out.println(hm.containsValue("3")); //false
		System.out.println();
		System.out.println(hm.containsValue(0)); //true
		System.out.println();
		System.out.println(hm.containsValue("null")); //false
		System.out.println();
		System.out.println(hm.containsValue(null)); //true
		System.out.println();
		
		
		
		
		
	}
}
