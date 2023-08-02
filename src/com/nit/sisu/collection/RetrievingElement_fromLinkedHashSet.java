package com.nit.sisu.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RetrievingElement_fromLinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		{
			lhs.add("a");
			lhs.add(5);
			lhs.add("b");
			lhs.add('c');
			lhs.add(6.7);
			
			System.out.println(lhs);
			System.out.println();
			//for- loop aplly only on index based
			// for-loop we can't apply on LinkedHashSet(I) becoz  it is  is not a index based and also get(-) method is not there in LinkedHashSet(I)..So alternate is Enumertaion or Itertaor
			//So alternate is Enumertaion or Itertaor or foreach loop is used becoz both are not index based
			//ListIterator also we can not used for retrieve  element in LinkedHashSet(I) because ListIterator is index based..
			
			/*for(int i=0;i<lhs.size(); i++)
			{
				System.out.println(lhs.get(i));
			}*/
			//Through Enumeration object
			Enumeration<Object> e = Collections.enumeration(lhs);
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			System.out.println();
			//Through Iterator object
			Iterator<Object> itr = lhs.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println();
			//Through foreach loop
			//foreach loop is the alternate of Iterator..it doesnot means iterator outdated..JVM does not understand foreach loop...If you compile foreach loop then iterator will came..
			for(Object obj : lhs)
			{
				if(obj instanceof String)
					System.out.println(((String)obj).toUpperCase());
				else
					System.out.println(obj);
			}
		}
	}
}
