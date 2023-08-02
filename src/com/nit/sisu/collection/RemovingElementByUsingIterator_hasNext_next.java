package com.nit.sisu.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementByUsingIterator_hasNext_next 
{
	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<>();
		Iterator<Object> itr1 = al.iterator();
		System.out.println(itr1.hasNext());///false
		//System.out.println(itr1.next()); //NoSuchElementException
		
		al.add("a");
		//System.out.println(itr1.next());//not allow
		
		Iterator<Object> itr2 = al.iterator();
		System.out.println(itr2.next()); 
		System.out.println(al); //a	
		al.remove("a");
		//System.out.println(itr2.next());//not allow
		
		//adding element in array
		al.add("s");
		al.add("i");
		al.add("s");
		al.add("u");
		Iterator<Object> itr3 = al.iterator();
		System.out.println(itr3.next()); 
		System.out.println(al);
		itr3.remove();
		System.out.println(itr3.next());
		System.out.println(al); 
	}
}
