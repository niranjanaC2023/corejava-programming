package com.nit.sisu.streamAPI;
import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamOf_fromCollection_ByUsing_StreamAPI
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

		Stream.of(al).forEach(System.out::println);
		System.out.println();

		Integer[] i = {10,20,30};
		Stream.of(i).forEach(System.out::print);
		System.out.println();

		Stream<Integer> s = Stream.of(9,99,999,999);
		s.forEach(System.out::println);
		
	}
}


