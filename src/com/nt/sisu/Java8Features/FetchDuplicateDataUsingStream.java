package com.nt.sisu.Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FetchDuplicateDataUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ram is a boy ram is a boy ram is a boy";
		List<String> list = Arrays.asList(s.split(" "));
		System.out.println(list);
		Map<String, Long> mapList = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("mapList: "+mapList);
		System.out.println();
		
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
		Map<String, Long> map = myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("map: "+map);
		System.out.println();
		
		String ss = "educationn";
		List<Character> ch = ss.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
		System.out.println(ch);
		Map<Character, Long> chList = ch.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("chList"+chList);

	}

}
