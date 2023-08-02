package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project9_WeakHashMap_replacing_keys_OnlyValue {
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
//*******************
		//we can't replace "key"....Only "value" will be replaced...
		//3 ways we can replaced:- Using "put" , "replace", "compute"
		//'compute" is functional interface..so discuss later..Now discuss "put", and "replace"
	//***difference***
		//put() method return type is Object..means it returns old value..
		//put() method, replace the "value", if "key" is not there...means no key is there ...
		//if any 'key" is there then it Overwrite old "value" to new "value"..
		System.out.println(whm.put(true, 6));
		System.out.println(whm);
		System.out.println();
		
		//replace(-) method return type is object...means it returns old value.
		//replace(-) method, replace the "value" and returns old value, if "key" is found/there...
		//if no key is there ..then it raise "null"
		System.out.println(whm.replace("sisu'", 30));
		System.out.println(whm);
		System.out.println();
		System.out.println(whm.replace(6, 30));
		System.out.println(whm);
		System.out.println();
	}
}
