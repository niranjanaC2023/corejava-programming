package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project4_WeakHashMap_difference_get_getOrDefault {
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
//********retrieving only values :- difference between get() and getOrDefault() ***********
		//get(-) method returns key matched values..if key is not there ..it returns "null"
	//if key is not available, it returns "null"..
	Object obj1 = whm.get("z");
	System.out.println(obj1);
	System.out.println();
	
	//getOrDefault(-) method returns key matched values..if key is not there ..it returns "null"
	//if key is not there ..it returns also "key specified default value" it means :-
	//if key is not available, it returns "null"..But i want instead of returning "null" , we return some Understandable message..
		Object obj2 = whm.get("z1");
		Object obj3 = whm.getOrDefault("z1", "key is not available" );
		System.out.println(obj3);
		System.out.println();
	}
}
