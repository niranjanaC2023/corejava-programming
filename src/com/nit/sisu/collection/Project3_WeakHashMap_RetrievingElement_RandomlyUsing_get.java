package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project3_WeakHashMap_RetrievingElement_RandomlyUsing_get {
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
		System.out.println(whm.size());  //5
		System.out.println(whm);
		System.out.println();
//********retrieving only values :- public V get(K k) ***********
		//get(-) method return type is "value" but that value is Object type..So
		Object obj1 = whm.get("a");
		System.out.println(obj1);
		System.out.println(whm.size()); //6
		System.out.println();
		
		Object obj2 = whm.get(true);
		System.out.println(obj2);
		System.out.println(whm.size()); //6
		System.out.println();

			//if get(-) method returns, it means :- i) key is there without value.. ii) key having value "null"
			Object obj3 = whm.get("sisu"); //key not there
			System.out.println(obj3);
			System.out.println(whm.size()); //6
			System.out.println();
			
			Object obj4 = whm.get("x"); //x key having "null"
			System.out.println(obj4);
			System.out.println(whm.size()); //6
			System.out.println();
			
												
	}
}
