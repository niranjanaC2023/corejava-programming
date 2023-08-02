package com.nit.sisu.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Remove_StringElement_UsingIterator
{
	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<>();
		{
			al.add("hi");
			al.add(7);
			al.add('h');
			al.add(9.4);
			System.out.println(al);
			//remove first element using iterator concept
			Iterator<Object> itr = al.iterator();
			while(itr.hasNext())
			{
				Object obj = itr.next();
				if(obj instanceof String)
				{
					itr.remove();
				}
			}
			System.out.println(al);  
		}
	}
}