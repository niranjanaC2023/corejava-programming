package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project10_LinkedHashMap_differenceBetwn_remove_remove {
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
//********Difference between : remove(K) and remove(K,V)***********
//*****difference****
		//remove(K) method introduced in 1.2v
		//remove(K) method , remove the key if given is matched/present..
		//remove(K) method return type is "Object" ..it means it returns old value"
		System.out.println(lhm.remove("a")); //0
		System.out.println();
		System.out.println(lhm.remove("sisu")); //null
		System.out.println();
		System.out.println(lhm.remove(true)); //3
		System.out.println();
		System.out.println(lhm.remove("null")); //null
		System.out.println();
		System.out.println(lhm.remove(null)); //7
		System.out.println();
		//remove(K,V) method introduced in 1.8v
		 //remove(K,V) method , remove both "key and value" from Map and return "true",  if given "key and Value" is matched/present.....
		//if both "key and Value" not matched then return "false"
	   //remove(K,V) method return type is "boolean ..it means it returns "true/false"
		System.out.println(lhm);
		System.out.println(lhm.remove("c", 3)); //true
		System.out.println();
		System.out.println(lhm.remove(6, 2)); //true
		System.out.println();
		System.out.println(lhm.remove(2, 6)); //false
		System.out.println();
		System.out.println(lhm.remove("x",  null)); //true
		System.out.println();
		System.out.println(lhm);
	}
}
