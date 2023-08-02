package com.nit.sisu.collection;
import java.util.ArrayList;
public class countElement_fromCollection_ByUsing_StreamAPI
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
		//count method by using StreamAPI(count whose marks is <10)//count method used for counting from the collection...
		long studentMarks = marks.stream().filter(m->m<6).count();
		System.out.println(studentMarks);
	}
}