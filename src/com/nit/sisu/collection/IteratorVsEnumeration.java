package com.nit.sisu.collection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorVsEnumeration 
{
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		/*
		 Iterator<Object> itr1 = al.iterator();
		 System.out.println(itr1.next()); //a
		 
		 al.add("e");//concurrently modified with collection method
		// System.out.println(itr1.next());//throws CME because Iterator is fail-fast cursor
		 
		 Enumeration e1 = Collections.enumeration(al);
		 System.out.println(e1.nextElement()); //a
		 
		 al.add("f");  //concurrently modified with collection method
		 System.out.println(e1.nextElement());  //throws CME becoz Collections.enumeration(-) is fail-fast cursor
		 */
		//Legacy Iterator collection
		Vector<Object> v1 = new Vector<>();
		v1.add(5);
		 Iterator<Object> itr2 = v1.iterator();
		 System.out.println(itr2.next()); //5
		 
		 v1.add(6); //concurrently modified with collection method
		 //System.out.println(itr2.next());  //throws CME becoz Iterator is fail-fast cursor
		 
		 Enumeration <Object> e2 = v1.elements();
		 System.out.println(e2.nextElement()); //5
		 
		v1.add(7);
		 System.out.println(e2.nextElement());//6 //no exception becoz Enumeration with via elements() method with legacy implementation is not fail-fast becoz vector is thread safe..
		 
	}
}
