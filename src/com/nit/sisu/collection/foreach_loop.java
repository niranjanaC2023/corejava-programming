package com.nit.sisu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class foreach_loop {
	public static void main(String[] args) {
		//for- loop aplly only on index based
		// for-loop we can't apply on LinkedHashSet(I) becoz  it is  is not a index based and also get(-) method is not there in LinkedHashSet(I)..So alternate is Enumertaion or Itertaor
		//So alternate is Enumertaion or Itertaor or foreach loop is used becoz both are not index based
		//ListIterator also we can not used for retrieve  element in LinkedHashSet(I) because ListIterator is index based..
		
		//*********foreach loop rules*************
		//foreach loop is the alternate of Iterator..it doesnot means iterator outdated..
		//JVM does not understand foreach loop...If you compile foreach loop then iterator will came..
		//foreach loop is not index based, 
		//Collection(I) and its sub type are not index based so we can use its objects as argument to foreach loop..
		//Map(I) and its sub type are  index based so we can not use its objects as argument to foreach loop..
		
		//Rule1 :- Object type must be array or Iterable type..
		/*
		for(char ch : "abc")     //"abc" string type not allowed
		{
			System.out.println(ch);
		}
		*/
		/*
		char[] ca = new char[] {'a', 'b', 'c'};
		for(char ch : ca)
		{
			System.out.println(ch);     //allowed 
		}
		
		*/
		//Rule2: variable type must be Same type or its higher type than the returning value or object...
		/*
		char[] ca = new char[] {'a', 'b', 'c'};
		for(int i : ca)
		{
			System.out.println(i); 	//allow
		}
		*/
		/*
		char[] ca = new char[] {'a', 'b', 'c'};
		for(byte b: ca)
		{
			System.out.println(b); 	//lower type  not allow
		}
		*/
		//Rule3: Variable must be declared infor(-) paranthesis 
		/*
		 char[] ca = new char[] {'a', 'b', 'c'};
		int i1;			//not allow
		for(i1 : ca) { }
		*/
		/*
		char[] ca = new char[] {'a', 'b', 'c'};
		for(int i1 : ca) { }	  //allow
		*/
		
		//Rule4 : Collection type allow becoz Collection is sub type of interface..
			//Iterator is not allow becoz iterator is not subtype of iterable..
		
			ArrayList<String>  al3 = new ArrayList<>();
				Iterator<String> itr = al3.iterator();
				for(String s : al3) { }  //allow
				//for(String s : itr) { }	//not allow
				
		//Rule5:- All collection interface and its sub types are allowed as argument to foreach loop..\
				//Map interface and its sub types are not allowed as argument to foreach loop...
				//cursor objects are not allowed as argument to foreach loop....
				LinkedHashMap<String, Integer> lhs = new LinkedHashMap<>();
				//	for(String s : lhs) { } 	//not allowed..
				
			//Rule6:- Separator must be colon (:)
				LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
				{
					for(String s : lhs1) { }	//allow -->here copying "lhs1" element
					//for(String s =  lhs1) { }	//not allowed-->here copying "lhs1" reference 
					//for(String s ;  lhs1) { }		//not allowed---->here it becomes regular for loop, third expression missed So error..
					//for(String s ,  lhs1) { }    //not allowed---->it becomes argument to for loop...
				}
	}
}
