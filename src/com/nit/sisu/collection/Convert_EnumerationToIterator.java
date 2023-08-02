//converts elements from enumertaion to Itertor
package com.nit.sisu.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Iterator;
public class Convert_EnumerationToIterator
{
	public static void main(String[] args)
	{
		ArrayList<Object> sl = new ArrayList<>();
		{
			sl.add("hi");
			sl.add(7);
			sl.add('h');
			sl.add(9.4);
			System.out.println(sl);
			//for remove purpose we use Iteretor..So convert Enumeration to Iterator
			Iterator<Object> itr = Collections.enumeration(sl).asIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println(sl);
			
		}
	}
}