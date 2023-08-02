package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project6_LinkedHashMap_SearchingElement_Only_Keys {
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
//********searching for key:- public boolean containsKey(K k)***********
		//containskey(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is boolean. So it returns "true" , if given "key" is present...and returns "false", if given "key" is not present..
		System.out.println(lhm.containsKey("a")); //true
		System.out.println();
		System.out.println(lhm.containsKey("sisu")); //false
		System.out.println();
		System.out.println(lhm.containsKey(true)); //true
		System.out.println();
		System.out.println(lhm.containsKey("true")); //false
		System.out.println();	
	}
}
