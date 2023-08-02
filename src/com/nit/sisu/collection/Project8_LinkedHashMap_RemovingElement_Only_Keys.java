package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project8_LinkedHashMap_RemovingElement_Only_Keys {
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
//********removing one entries(Key):- public V remove(Object k)***********
		//remove(-) method is working on "key" based searching...
		//"key" based searching means :- it used for hashCode(), == , equals()
		//This method return type is Value. 
		//So it returns "key's value",  if given "key" is present...and returns "null", if given "key" is not present..
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
	}
}
