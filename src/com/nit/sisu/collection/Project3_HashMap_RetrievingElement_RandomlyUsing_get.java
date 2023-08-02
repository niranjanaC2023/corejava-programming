package com.nit.sisu.collection;

import java.util.HashMap;

public class Project3_HashMap_RetrievingElement_RandomlyUsing_get {
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
		System.out.println(hm.size());  //5
		System.out.println(hm);
		System.out.println();
//********retrieving only values :- public V get(K k) ***********
		//get(-) method return type is "value" but that value is Object type..So
		Object obj1 = hm.get("a");
		System.out.println(obj1);
		System.out.println(hm.size()); //6
		System.out.println();
		
		Object obj2 = hm.get(true);
		System.out.println(obj2);
		System.out.println(hm.size()); //6
		System.out.println();

			//if get(-) method returns, it means :- i) key is there without value.. ii) key having value "null"
			Object obj3 = hm.get("sisu"); //key not there
			System.out.println(obj3);
			System.out.println(hm.size()); //6
			System.out.println();
			
			Object obj4 = hm.get("x"); //x key having "null"
			System.out.println(obj4);
			System.out.println(hm.size()); //6
			System.out.println();
			
												
	}
}
