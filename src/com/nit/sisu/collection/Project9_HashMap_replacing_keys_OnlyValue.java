package com.nit.sisu.collection;

import java.util.HashMap;

public class Project9_HashMap_replacing_keys_OnlyValue {
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
//*******************
		//we can't replace "key"....Only "value" will be replaced...
		//3 ways we can replaced:- Using "put" , "replace", "compute"
		//'compute" is functional interface..so discuss later..Now discuss "put", and "replace"
	//***difference***
		//put() method return type is Object..means it returns old value..
		//put() method, replace the "value", if "key" is not there...means no key is there ...
		//if any 'key" is there then it Overwrite old "value" to new "value"..
		System.out.println(hm.put(true, 6));
		System.out.println(hm);
		System.out.println();
		
		//replace(-) method return type is object...means it returns old value.
		//replace(-) method, replace the "value" and returns old value, if "key" is found/there...
		//if no key is there ..then it raise "null"
		System.out.println(hm.replace("sisu'", 30));
		System.out.println(hm);
		System.out.println();
		System.out.println(hm.replace(6, 30));
		System.out.println(hm);
		System.out.println();
	}
}
