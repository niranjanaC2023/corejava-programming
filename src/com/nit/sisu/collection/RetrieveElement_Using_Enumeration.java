package com.nit.sisu.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
public class RetrieveElement_Using_Enumeration
{
	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<>();
		{
		al.add("6");
		al.add("hi");
		al.add('u');
		al.add(8.9);
		System.out.println(al);
		Enumeration<Object> enm = Collections.enumeration(al);
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		System.out.println(al);
		}
	}
}