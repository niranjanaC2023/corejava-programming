package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Project11_WeakHashMap_DifferenceBetween_replace_replace {
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
	//***difference between:: replace(K,V) and replace(K,V,V) *********
		//replace(-,-) method return type is Object..means returns old value...
		//replace(-,-) method....replace the "value" and return old value, if "key" is matched...
		//if no key is there ..then it raise "null"
		System.out.println(whm.replace("sisu'", 30));
		System.out.println(whm);
		System.out.println();
		System.out.println(whm.replace(6, 30));
		System.out.println(whm);
		System.out.println();
		//replace(-,-,-) method return type is boolean type...means return true/false..
		//replace(-,-,-) method replace "value" and return true, if both "key & value" matched...else return flase
		System.out.println(whm);
		System.out.println(whm.replace("sisu'", 15,30));
		System.out.println(whm);
		System.out.println();
		System.out.println(whm.replace("c",3,6));
		System.out.println(whm);
		System.out.println();
		System.out.println(whm.replace(6, 30,60));
		System.out.println(whm);
		System.out.println();
		System.out.println(whm.replace(true,6,"3pm"));
		System.out.println(whm);
		System.out.println();
		System.out.println(whm.replace(true,3,"3pm"));
		System.out.println(whm);
	}
}
