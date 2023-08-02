package com.nit.sisu.collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Convert_Enumeration_To_Iterator {
	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		{
			lhs.add("a");
			lhs.add(5);
			lhs.add("b");
			lhs.add('c');
			lhs.add(6.7);
			System.out.println(lhs);
			System.out.println();
		//Using Enumeration, we can not remove element from collection..only retrieve happens
		//Using iterator, we can remove element from collection also retrieve..
		//So we Convert Enumeration to Iterator		
		Iterator<Object> itr2 = Collections.enumeration(lhs).asIterator();
		while(itr2.hasNext())
		{
		System.out.println(itr2.next());
		}
		System.out.println(lhs);
	}
}
}