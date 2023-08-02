package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project3_LinkedHashMap_RetrievingElement_RandomlyUsing_get {
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
		System.out.println(lhm.size());  //5
		System.out.println(lhm);
		System.out.println();
//********retrieving only values :- public V get(K k) ***********
		//get(-) method return type is "value" but that value is Object type..So
		Object obj1 = lhm.get("a");
		System.out.println(obj1);
		System.out.println(lhm.size()); //6
		System.out.println();	
		Object obj2 = lhm.get(true);
		System.out.println(obj2);
		System.out.println(lhm.size()); //6
		System.out.println();
			//if get(-) method returns, it means :- i) key is there without value.. ii) key having value "null"
			Object obj3 = lhm.get("sisu"); //key not there
			System.out.println(obj3);
			System.out.println(lhm.size()); //6
			System.out.println();
			Object obj4 = lhm.get("x"); //x key having "null"
			System.out.println(obj4);
			System.out.println(lhm.size()); //6
			System.out.println();	
	}
}
