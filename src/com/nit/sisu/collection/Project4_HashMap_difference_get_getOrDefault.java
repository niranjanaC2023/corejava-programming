package com.nit.sisu.collection;

import java.util.HashMap;

public class Project4_HashMap_difference_get_getOrDefault {
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
//********retrieving only values :- difference between get() and getOrDefault() ***********
		//get(-) method returns key matched values..if key is not there ..it returns "null"
	//if key is not available, it returns "null"..
	Object obj1 = hm.get("z");
	System.out.println(obj1);
	System.out.println();
	
	//getOrDefault(-) method returns key matched values..if key is not there ..it returns "null"
	//if key is not there ..it returns also "key specified default value" it means :-
	//if key is not available, it returns "null"..But i want instead of returning "null" , we return some Understandable message..
		Object obj2 = hm.get("z1");
		Object obj3 = hm.getOrDefault("z1", "key is not available" );
		System.out.println(obj3);
		System.out.println();
	}
}
