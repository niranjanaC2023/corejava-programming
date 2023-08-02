package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project11_LinkedHashMap_DifferenceBetween_replace_replace {
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
	//***difference between:: replace(K,V) and replace(K,V,V) *********
		//replace(-,-) method return type is Object..means returns old value...
		//replace(-,-) method....replace the "value" and return old value, if "key" is matched...
		//if no key is there ..then it raise "null"
		System.out.println(lhm.replace("sisu'", 30));
		System.out.println(lhm);
		System.out.println();
		System.out.println(lhm.replace(6, 30));
		System.out.println(lhm);
		System.out.println();
		//replace(-,-,-) method return type is boolean type...means return true/false..
		//replace(-,-,-) method replace "value" and return true, if both "key & value" matched...else return flase
		System.out.println(lhm);
		System.out.println(lhm.replace("sisu'", 15,30));
		System.out.println(lhm);
		System.out.println();
		System.out.println(lhm.replace("c",3,6));
		System.out.println(lhm);
		System.out.println();
		System.out.println(lhm.replace(6, 30,60));
		System.out.println(lhm);
		System.out.println();
		System.out.println(lhm.replace(true,6,"3pm"));
		System.out.println(lhm);
		System.out.println();
		System.out.println(lhm.replace(true,3,"3pm"));
		System.out.println(lhm);
	}
}
