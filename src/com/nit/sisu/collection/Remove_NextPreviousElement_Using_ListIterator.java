package com.nit.sisu.collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class Remove_NextPreviousElement_Using_ListIterator
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
			//Retrieve element using Iterator(forward order)
			ListIterator<Object> itr = al.listIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				
			} 
			System.out.println();  
			//Retrieve element using Iterator(backward order)
			while(itr.hasPrevious())
			{
				System.out.println(itr.previous());
				
				
			}
			System.out.println(itr.previousIndex());
			System.out.println(al);  
		}
	}
}