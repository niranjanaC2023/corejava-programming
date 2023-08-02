package com.nit.sisu.collection;
import java.util.ArrayList;

public class ListIterator1 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<>();
		{
			al.add("a");
			al.add(5);
			al.add("b");
			al.add(6);
			al.add("c");
			al.add(7);
			System.out.println(al);
			System.out.println();
//====replacement element===================================================
			java.util.ListIterator<Object>  listitr = al.listIterator();
	    	while(listitr.hasNext())
			{
				Object obj = listitr.next();
				if(obj instanceof String)
				{
					String s = (String)obj;
					listitr.set(s.toUpperCase());
				}
			}
			System.out.println(al);
			System.out.println();
//====insert element=====================================================
			int count = 0;
			while(listitr.hasNext()) 
			{
				Object obj = listitr.next();
				if(obj instanceof String)
				{
					String s = (String)obj;
					listitr.set(s.toUpperCase());
				}
				 else if(obj instanceof Integer)
				 {
					if(count++ == 0) 
						listitr.add(20);
				 }
			System.out.println();
		}
		System.out.println(al);
		}
	}
}
