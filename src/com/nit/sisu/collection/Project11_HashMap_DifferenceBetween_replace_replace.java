package com.nit.sisu.collection;

import java.util.HashMap;

public class Project11_HashMap_DifferenceBetween_replace_replace {
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
	//***difference between:: replace(K,V) and replace(K,V,V) *********
		//replace(-,-) method return type is Object..means returns old value...
		//replace(-,-) method....replace the "value" and return old value, if "key" is matched...
		//if no key is there ..then it raise "null"
		System.out.println(hm.replace("sisu'", 30));
		System.out.println(hm);
		System.out.println();
		System.out.println(hm.replace(6, 30));
		System.out.println(hm);
		System.out.println();
		//replace(-,-,-) method return type is boolean type...means return true/false..
		//replace(-,-,-) method replace "value" and return true, if both "key & value" matched...else return flase
		System.out.println(hm);
		System.out.println(hm.replace("sisu'", 15,30));
		System.out.println(hm);
		System.out.println();
		System.out.println(hm.replace("c",3,6));
		System.out.println(hm);
		System.out.println();
		System.out.println(hm.replace(6, 30,60));
		System.out.println(hm);
		System.out.println();
		System.out.println(hm.replace(true,6,"3pm"));
		System.out.println(hm);
		System.out.println();
		System.out.println(hm.replace(true,3,"3pm"));
		System.out.println(hm);
	}
}
