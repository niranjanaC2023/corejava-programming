package com.nit.sisu.streamAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class compareToElement_fromCollection_ByUsing_StreamAPI
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
		//compareTo method by using StreamAPI(sort ascending or descnding) and display it as List
		List<Integer> studentMarks1 = marks.stream().sorted().collect(Collectors.toList());//ascending
		List<Integer> studentMarks2 = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());//ascending
		List<Integer> studentMarks3 = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());//Descending
		List<Integer> studentMarks4 = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());//Descending
		System.out.println(studentMarks1);
		System.out.println(studentMarks2);
		System.out.println(studentMarks3);
		System.out.println(studentMarks4);
		System.out.println();

		ArrayList<String> marks5 = new ArrayList<>();
		marks5.add("Anushka");
		marks5.add("kajol");
		marks5.add("rani");
		marks5.add("kiara");
		marks5.add("mouni");
		System.out.println(marks5);
		//compareTo method by using StreamAPI(sort ascending or descnding) and display it as List
		List<String> studentMarks6 = marks5.stream().sorted().collect(Collectors.toList());//ascending
		List<String> studentMarks7 = marks5.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());//ascending
		List<String> studentMarks8 = marks5.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());//Descending
		List<String> studentMarks9 = marks5.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());//Descending
		System.out.println(studentMarks6);
		System.out.println(studentMarks7);
		System.out.println(studentMarks8);
		System.out.println(studentMarks9);
		System.out.println();
		
		
		ArrayList<String> marks10 = new ArrayList<>();
		marks10.add("AA");
		marks10.add("AAA");
		marks10.add("AAAA");
		marks10.add("AAAAA");
		marks10.add("AAA");
		System.out.println(marks10);
		//compareTo method by using StreamAPI(sort ascending or descnding) and display it as List
		Comparator<String> c = (s1,s2)->{
										int l1=s1.length();
										int l2 =s2.length();
										if(l1<l2) return-1;
										else if(l1>l2) return +1;
										else return s1.compareTo(s2);
										};		
		List<String> sortedList = marks10.stream().sorted(c).collect(Collectors.toList());//ascending	
		System.out.println(sortedList);
		
	}
}