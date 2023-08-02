package com.nit.sisu.streamAPI;
import java.util.ArrayList;
public class toArrayElement_fromCollection_ByUsing_StreamAPI
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(27);
		al.add(4);
		al.add(6);
		al.add(7);
		al.add(12);
		System.out.println(al);
		System.out.println();
	Integer[] i = al.stream().toArray(Integer[]::new);
		for(Integer i1:i)
		{
		System.out.println(i1);
		}
		
	}
}


