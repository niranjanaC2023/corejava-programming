package com.nit.sisu.collection;
import java.util.ArrayList;

public class ListIterator 
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
//====Retrieve forward direction===================================================
			java.util.ListIterator<Object>  listitr = al.listIterator();
			while(listitr.hasNext())
			{
				System.out.println(listitr.next());
			}
			System.out.println();
//====Retrieve backward direction=====================================================
			while(listitr.hasPrevious())
			{
				System.out.println(listitr.previous());
			}
			System.out.println();
		}
		System.out.println(al);
	}
}
