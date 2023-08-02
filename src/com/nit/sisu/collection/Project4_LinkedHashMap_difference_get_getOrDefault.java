package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project4_LinkedHashMap_difference_get_getOrDefault {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		System.out.println(lhm.size()); //0
		System.out.println(lhm);
		System.out.println();
//******adding one entries :- public V   put(K  k,V v)******
		lhm.put("a",  0);
		lhm.put(6,  2);
		lhm.put("c", 3);
		lhm.put(null, 7);
		lhm.put(true, 3); 
		lhm.put("x", null);
		System.out.println(lhm.size());  //6
		System.out.println(lhm);
		System.out.println();
//********retrieving only values :- difference between get() and getOrDefault() ***********
		//get(-) method returns key matched values..if key is not there ..it returns "null"
	//if key is not available, it returns "null"..
	Object obj1 = lhm.get("z");
	System.out.println(obj1);
	System.out.println();
	//getOrDefault(-) method returns key matched values..if key is not there ..it returns "null"
	//if key is not there ..it returns also "key specified default value" it means :-
	//if key is not available, it returns "null"..But i want instead of returning "null" , we return some Understandable message..
		Object obj2 = lhm.get("z1");
		Object obj3 = lhm.getOrDefault("z1", "key is not available" );
		System.out.println(obj3);
		System.out.println();
	}
}
