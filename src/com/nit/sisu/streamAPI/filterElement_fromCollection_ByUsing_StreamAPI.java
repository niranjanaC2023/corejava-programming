package com.nit.sisu.streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class filterElement_fromCollection_ByUsing_StreamAPI
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
		//filtering by using StreamAPI(find even number)//filter method used for retrieve some objects from Group of objects..
		List<Integer> lo = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(lo);
	}
}
