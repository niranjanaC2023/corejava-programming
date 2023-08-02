package com.nit.sisu.collection;
import java.util.LinkedHashMap;
public class Project2_LinkedHashMap_Difference_put_putIfAbsent {
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
		System.out.println(lhm.size());  //5
		System.out.println(lhm);
		System.out.println();
		lhm.put(true, 4); 
		System.out.println(lhm.size()); //5
		System.out.println(lhm);
		System.out.println();
//*******Difference put() and putIfAbsent()******
		//if value is not there inside key then we can add value and return value
		System.out.println(lhm.put("x", "Niranjana")); //x key not there
		System.out.println(lhm.size()); //6
		System.out.println(lhm);
		System.out.println();
		//if value is there inside key then old value overwritten by new value
		System.out.println(lhm.put("x", "Niranjana charty")); // x key is already there
		System.out.println(lhm.size()); //6
		System.out.println(lhm);
		System.out.println();	
		//if value is not there inside key then we can add value and return null
		System.out.println(lhm.putIfAbsent("y", "Susanta")); //y key not there
	    System.out.println(lhm.size()); //7
		System.out.println(lhm);
		System.out.println();
		//if value is there inside key then old value value will be return
		lhm.putIfAbsent("y", "Susanta charty");  //y key is already there
		System.out.println(lhm.size()); //7
		System.out.println(lhm);
		System.out.println();	
	}
}
