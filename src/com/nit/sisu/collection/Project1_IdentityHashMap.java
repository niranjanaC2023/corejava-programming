package com.nit.sisu.collection;
import java.util.IdentityHashMap;
public class Project1_IdentityHashMap {
	public static void main(String[] args) {
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<>();
		System.out.println(ihm);
		System.out.println(ihm.size());
		System.out.println();
		//accept primitive datatype
				String s2 = "sisu";
				Integer i2 = 30;
				boolean b2 = true;
				char c2 = 'y';
				double d2 = 23.02;
				float f2 = 3.0f;
				ihm.put(s2, 30);
				ihm.put(i2, "susanta");
				ihm.put(b2, "false, sisu is 29");
				ihm.put(c2, 'z');
				ihm.put(d2,32.02);
				ihm.put(f2, 60.f);
				ihm.put(new String("a"), 3); //allow becoz reference is string pooling
				//accept Object type
				ihm.put("Niranjana", 30);
				ihm.put("Prasanta", 22);
				ihm.put("Manoj", 35);
				ihm.put("Titu", 21);
				ihm.put("jagannatha", 35);
				System.out.println(ihm);
				System.out.println(ihm.size());
	}
}
