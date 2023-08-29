package com.nit.sisu.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main 
{
	public static void main(String[] args) 
	{
		//23) How to Sort() a List of Integer using Collection and Stream api?
		List<Integer> number = new ArrayList<>(List.of(2,38,1,3,4));
		Collections.sort(number);
		System.out.println("Ascending Order using colllection:"+number);
		Collections.reverse(number);
		System.out.println("Descending Order using colllection:"+number);
		
		
		//22)Difference between map() and flatMap()?
		
		
		//21)Given a Array of integers, find out all the numbers starting with 1 using Stream functions?
		int[] number2 = {5,19,23,34};
		Arrays.stream(number2).boxed().map(n->n+"").filter(n->n.startsWith("2")).forEach(System.out::println);
		
		//20)How to find longest String from given array?
		String[] string = {"abc","auaa","iwwsb"};
		String longestString = Arrays.stream(string).reduce((string1,string2)->string1.length() > string2.length()?string1:string2).get();
		System.out.println("Longest String: "+longestString);
		
		//19)How to find second highest number and second lowest number from given array?
		int[] number3 = {10,23,4,67};
		System.out.println("Numbers are: "+Arrays.toString(number3));
		Arrays.stream(number3).sorted().skip(1).forEach(System.out::println); //second lowest number
		System.out.println();
		Arrays.stream(number3).boxed().sorted(Comparator.reverseOrder()).skip(1).forEach(System.out::println); //second highest number
		System.out.println();
		
		//18) Write a program to find the first Non-Repeated and Repeated character in a String?
		
		//17)Write a program to print the count of each character in a String?
		String name = "Niranjana";
		String[] splitedName = name.split("");
		Map<String,List<String>> listedCharacter = Arrays.stream(splitedName).collect(Collectors.groupingBy(Function.identity(),Collectors.toList()));
		System.out.println("listedCharacter"+listedCharacter);
		Map<String,Long> countEachCharacter = Arrays.stream(splitedName).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("countEachCharacter: "+countEachCharacter);
		System.out.println();
		
		//16)Write a Program to find the numbers greater than 5  in an array?
		int[] number4 = {19,2,1,22};
		for(int num : number4)
		{
			if(num > 5)
			{
				System.out.println(num);
			}
		}
		System.out.println();
		
		//15)How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
		List<String> myList = new ArrayList<>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");
		Optional.ofNullable((myList)).filter(n->!n.isEmpty()).ifPresent(System.out::println);
		System.out.println();      
						
		//14)How to find only duplicate elements with its count from the String ArrayList in Java8?
		String s = "Niranjana";
		String[] splitedString = s.split("");
		Map<String,Long> countedString = Arrays.stream(splitedString).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("countedString: "+countedString);
		List<String> duplicatesAre = Arrays.stream(splitedString).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("duplicatesAre: "+duplicatesAre);
		
		//13)How to count number of String from the String ArrayList in Java8?
		String[] listOfString = {"raja","rani","proja","raja","raja"};
		Map<String,Long> countedString2 = Arrays.stream(listOfString).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("countedString2: "+countedString2);
		System.out.println();
		
		//12)How to use map to convert object into Uppercase in Java 8?
		List<String> lowerCaseStrings = Arrays.asList("bc","ab");
		System.out.println("lowerCaseStrings: "+lowerCaseStrings);
		List<String> upperCaseStrings = lowerCaseStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("upperCaseStrings: "+upperCaseStrings);
		System.out.println();
		
		//11)Java 8 program to perform cube on list elements and filter numbers greater than 50?
		List<Integer> number6 = Arrays.asList(2,3,4);
		number6.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
		System.out.println();
		
		//10)Write a Java 8 program to concatenate two Streams?
		Stream<String> string1 = Stream.of("Niranjana","Charty");
		Stream<String> string2 = Stream.of("Susanta","Charty");
		Stream.concat(string1,string2).forEach(System.out::print);
		System.out.println();

		//9)How will you get the current date and time using Java 8 Date and Time API?
		System.out.println("Current Date Time: "+java.time.LocalDateTime.now());
		System.out.println();
		
		//8)Given a list of integers, sort all the values present in it in descending order using Stream functions?
		List<Integer> listOfInteger = Arrays.asList(1,10,3,8,8,2,13,13);
		listOfInteger.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
		
		//7)Given a list of integers, sort all the values present in it using Stream functions?(default is ascending)
		List<Integer> listOfInteger1 = Arrays.asList(1,10,3,8,8,2,13,13);
		listOfInteger1.stream().sorted().forEach(System.out::println);
		System.out.println();

		//6)Given a list of integers, find the maximum value element present in it using Stream functions?
		List<Integer> listOfInteger2 = Arrays.asList(1,10,3,8,8,2,13,13);
		long maxNumber = listOfInteger2.stream().max(Integer::compare).get();
		System.out.println("Max Number: "+maxNumber);
		List<Integer> duplicatesAre2 = listOfInteger.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("duplicatesAre2: "+duplicatesAre2);
		System.out.println();
		
		//5)Given a list of integers, find the total number of elements present in the list using Stream functions?
		List<Integer> listOfInteger3 = Arrays.asList(1,10,3,8,8,2,13,13);
		long totalNumberOfElements = listOfInteger3.stream().count();
		System.out.println("totalNumberOfElements: "+totalNumberOfElements);
		System.out.println();

		//4)Given the list of integers, find the first element of the list using Stream functions?
		List<Integer> listOfInteger4 = Arrays.asList(1,10,3,8,2,13);
		listOfInteger4.stream().findFirst().ifPresent(System.out::println);
		System.out.println();

		//3)How to find duplicate elements in a given integers list in java using Stream functions?
		List<Integer> listOfInteger7 = Arrays.asList(1,10,3,8,8,2,13,13);
		Set<Integer> set = new HashSet<>();
		listOfInteger7.stream().filter(n->!set.add(n)).collect(Collectors.toList());//forEach(System.out::println);		

		//2)Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		List<Integer> listOfInteger5 = Arrays.asList(1,10,3,8,2,13,12);

		//1)Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		List<Integer> listOfInteger6 = Arrays.asList(1,10,3,8,2,13,12);
		
	}

}
