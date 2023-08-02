package com.nit.sisu.collection;

import java.util.WeakHashMap;

public class Difference_HashMap_WeakHashmap {
	public static void main(String[] args)throws InterruptedException {
//*****difference between HashMap and WeakHashMap******
	//****HashMap*****
		//HashMap accept both Object and primitive datatype like String, Number,boolean,char,null,long,float,double..etc as key..
		// there is  method to retrieve keys in HashMap..
	/*
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println();
		//accept primitive datatype
		String s1 = "sisu";
		Integer i1 = 30;
		boolean b1 = true;
		char c1 = 'y';
		double d1 = 23.02;
		float f1 = 3.0f;
		hm.put(s1, 30);
		hm.put(i1, "sisu");
		hm.put(b1, "false, sisu is 29");
		hm.put(c1, 'z');
		hm.put(d1,32.02);
		hm.put(f1, 60.f);
		//accept Object type
		hm.put("Niranjana", 30);
		hm.put("Prasanta", 22);
		hm.put("Manoj", 35);
		hm.put("Titu", 21);
		hm.put("jagannatha", 35);
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println();
*/
//***WeakHashMap*****
				//WeakHashMap  accept only Objects as key..
				//WeakMap objects doesn't avert(avoid) garbage collection, if there are no references to the object which is acting like a key. 
				//Therefore there is no method to retrieve keys in WeakMap,
				//There is no size property exists in WeakMap
		
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		System.out.println(whm);
		System.out.println(whm.size());
		System.out.println();
		//accept primitive datatype
		String s2 = "sisu";
		Integer i2 = 30;
		boolean b2 = true;
		char c2 = 'y';
		double d2 = 23.02;
		float f2 = 3.0f;
		whm.put(s2, 30);
		whm.put(i2, "susanta");
		whm.put(b2, "false, sisu is 29");
		whm.put(c2, 'z');
		whm.put(d2,32.02);
		whm.put(f2, 60.f);
		//accept Object type
		whm.put("Niranjana", 30);
		whm.put("Prasanta", 22);
		whm.put("Manoj", 35);
		whm.put("Titu", 21);
		whm.put("jagannatha", 35);
		System.out.println(whm);
		System.out.println(whm.size());
		
		System.gc();
		Thread.sleep(5000);
		System.out.println(whm);
		System.out.println(whm.size());
	}
}
//Here Primitive datatype are not reference....also not avoided  because these are looking as Un-referenced object 
//but externally reference is string constant pooling...Except 2 i.e double, float
//all these  objects are two having two type of reference:- i) string constant pool  ii) own reference
