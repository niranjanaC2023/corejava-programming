package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project10_WeakHashMap_differenceBetwn_remove_remove {
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
//********Difference between : remove(K) and remove(K,V)***********
		//remove(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is Value. 
		//So it returns "key's value",  if given "key" is present...and returns "null", if given "key" is not present..
		
//*****difference****
		//remove(K) method introduced in 1.2v
		//remove(K) method , remove the key if given is matched/present..
		//remove(K) method return type is "Object" ..it means it returns old value"
		System.out.println(whm.remove("a")); //0
		System.out.println();
		System.out.println(whm.remove("sisu")); //null
		System.out.println();
		System.out.println(whm.remove(true)); //3
		System.out.println();
		System.out.println(whm.remove("null")); //null
		System.out.println();
		System.out.println(whm.remove(null)); //7
		System.out.println();
		//remove(K,V) method introduced in 1.8v
		 //remove(K,V) method , remove both "key and value" from Map and return "true",  if given "key and Value" is matched/present.....
		//if both "key and Value" not matched then return "false"
	   //remove(K,V) method return type is "boolean ..it means it returns "true/false"
		System.out.println(whm);
		System.out.println(whm.remove("c", 3)); //true
		System.out.println();
		System.out.println(whm.remove(6, 2)); //true
		System.out.println();
		System.out.println(whm.remove(2, 6)); //false
		System.out.println();
		System.out.println(whm.remove("x",  null)); //true
		System.out.println();
		System.out.println(whm);
	}
}
