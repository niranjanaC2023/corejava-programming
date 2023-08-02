package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project9_LinkedHashMap_replacing_keys_OnlyValue {
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
//*******************
		System.out.println(lhm.put(true, 6));
		System.out.println(lhm);
		System.out.println();
		//replace(-) method return type is object...means it returns old value.
		//replace(-) method, replace the "value" and returns old value, if "key" is found/there...
		//if no key is there ..then it raise "null"
		System.out.println(lhm.replace("sisu'", 30));
		System.out.println(lhm);
		System.out.println();
		System.out.println(lhm.replace(6, 30));
		System.out.println(lhm);
		System.out.println();
	}
}
