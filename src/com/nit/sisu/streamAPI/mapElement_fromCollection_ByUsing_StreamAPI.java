package com.nit.sisu.streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class mapElement_fromCollection_ByUsing_StreamAPI
{
	public static void main(String[] args)
	{
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(27);
		marks.add(4);
		marks.add(6);
		marks.add(7);
		marks.add(12);
		System.out.println(marks);
		//mapping by using StreamAPI(add 5 in every element)//map method used for doing modification for every element..
		List<Integer> lo = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(lo);
	}
}