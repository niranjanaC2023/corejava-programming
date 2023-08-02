package com.nit.sisu.streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.Collectors;
public class sortElement_fromCollection_ByUsing_StreamAPI
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
		//sort method by using StreamAPI(sort ascending or descnding) and display it as List
		List<Integer> studentMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(studentMarks);
		
	}
}