package com.nit.sisu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class RetrievingElement_fromArrayList
{
	public static void main(String[] args) 
	{
			ArrayList<Object> al = new ArrayList<>();
			{
				al.add("a");
				al.add(5);
				al.add("b");
				al.add('c');
				al.add(6.7);
				System.out.println(al);
				System.out.println();
				//using get(-) method
				for(int i=0;i<al.size(); i++)
				{
					System.out.println(al.get(i));
				}
				System.out.println();
				//Through Enumeration object
				Enumeration<Object> e = Collections.enumeration(al);
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
				}
				System.out.println();
				//Through Iterator object
				Iterator<Object> itr = al.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				System.out.println();
				//Using for each loop
				for(Object obj : al)
				{
					if(obj instanceof String)
						System.out.println(((String)obj).toUpperCase());
					else
						System.out.println(obj);
				}
				System.out.println();
			}
	}
}
