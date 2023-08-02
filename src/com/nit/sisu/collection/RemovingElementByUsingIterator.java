package com.nit.sisu.collection;
import java.util.ArrayList;

public class RemovingElementByUsingIterator 
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
		/*
			Iterator<Object> itr1 = al.iterator();
			//itr1.remove();
			itr1.next();
			System.out.println(al);
			itr1.remove();
			System.out.println(al);	
		*/
		/*
			Iterator<Object> itr1 = al.iterator();
			while(itr1.hasNext())
			{
				itr1.next();
				itr1.remove();
			}
			System.out.println(al);
		*/
		/*
				Iterator<Object> itr2 = al.iterator();
				while(itr2.hasNext())
				{
					Object obj = itr2.next();
					if(obj instanceof  String)
					{
						itr2.remove();//allowed,only string objects are removed
					}
				}
				itr2.remove();
				System.out.println(al);
			*/
				/*
								Iterator<Object> itr2 = al.iterator();
								while(itr2.hasNext())
								{
									Object obj = itr2.next();
									if(obj instanceof  String)
									{
										//itr2.remove();
									}
								}
								itr2.remove();//allowed, only last element removed
								System.out.println(al);
				*/
			
	}
	}
}
