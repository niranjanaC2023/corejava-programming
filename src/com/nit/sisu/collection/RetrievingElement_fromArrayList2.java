package com.nit.sisu.collection;

import java.util.ArrayList;

public class RetrievingElement_fromArrayList2
{
	public static void main(String[] args) 
	{
			ArrayList<String> al = new ArrayList<>();
			{
				al.add("a");
				al.add("5");
				al.add("b");
				al.add("c");
				al.add("6.7");
				System.out.println(al);
				System.out.println();
				//using get(-) method
				for(int i=0;i<al.size(); i++)
				{
					System.out.println(al.get(i));
				}
				System.out.println();
				//Using for each loop
				for(String s : al)
				{
						System.out.println(s.toUpperCase());
				}
				System.out.println();
			}
	}
}
