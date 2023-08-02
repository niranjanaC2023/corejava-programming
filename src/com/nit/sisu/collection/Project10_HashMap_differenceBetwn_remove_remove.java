package com.nit.sisu.collection;

import java.util.HashMap;

public class Project10_HashMap_differenceBetwn_remove_remove {
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
//********Difference between : remove(K) and remove(K,V)***********
		//remove(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is Value. 
		//So it returns "key's value",  if given "key" is present...and returns "null", if given "key" is not present..
		
//*****difference****
		//remove(K) method introduced in 1.2v
		//remove(K) method , remove the key if given is matched/present..
		//remove(K) method return type is "Object" ..it means it returns old value"
		System.out.println(hm.remove("a")); //0
		System.out.println();
		System.out.println(hm.remove("sisu")); //null
		System.out.println();
		System.out.println(hm.remove(true)); //3
		System.out.println();
		System.out.println(hm.remove("null")); //null
		System.out.println();
		System.out.println(hm.remove(null)); //7
		System.out.println();
		//remove(K,V) method introduced in 1.8v
		 //remove(K,V) method , remove both "key and value" from Map and return "true",  if given "key and Value" is matched/present.....
		//if both "key and Value" not matched then return "false"
	   //remove(K,V) method return type is "boolean ..it means it returns "true/false"
		System.out.println(hm);
		System.out.println(hm.remove("c", 3)); //true
		System.out.println();
		System.out.println(hm.remove(6, 2)); //true
		System.out.println();
		System.out.println(hm.remove(2, 6)); //false
		System.out.println();
		System.out.println(hm.remove("x",  null)); //true
		System.out.println();
		System.out.println(hm);
	}
}
