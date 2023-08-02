package com.nit.sisu.collection;

import java.util.TreeSet;

public class TreeMap_Internals {
	public static void main(String[] args) {
		//TreeMap and TreeSet both are same..TreeSet internal uses TreeMap..
		//TreeSet is used for storing objects in sorting order/Alphabetical order..
		//sorting order is happend, whey they are homogenous..while comparing 2 object..
		//heterogenous object not stored in TreeSet..
		//So TreeSet and TreeMap as keys the object should be Homogenous and should not be "null"..
		//TreeSet store object in ascending order...
		
		
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add("a");
		//ts1.add(3);  //not allow becoz not homogenous
		ts1.add("b");	
		ts1.add("c");
		System.out.println(ts1);
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(6);
		ts2.add(5);
		System.out.println(ts2);//sorting is ascending order
		/*
		TreeSet<String> ts3 = new TreeSet<>();
		ts3.add("c");
		ts3.add("b");
		System.out.println(ts3);//sorting is ascending order
		
		TreeSet<String> ts4 = new TreeSet<>();
		ts4.add("c");
		ts4.add("c");
		System.out.println(ts4);//only one object stored
		*/
		//The default sorting order of TreeSet ? a) ascending   b) descending 
		//Ans:- TreeSet doesn't have in-built sorting order..
		//-->Storing an object inside TreeSet, then treeSet doesn't have any in-built comparison logic..
		//-->if you want to sort objects then there are 2 in-built logic should execute i.e 
		//i) Commparision logic  ii) sorting/swapping logic
		//comparison logic means :- Eg:-   a<b , then "a" stored in left and "b" stored in right..
		 //                                                    a >b , then "b" stored in left, "a" stored in right...
		//                                                     a==b , the one object stored and second object don't stored..
		//if we use add method, "a" is stored as it is..when we wants to store "b" then it compare with "a"..But this comparison concept not there in add() mehod
		//So Comparison purpose, we implements one interface called "Comparable" and use one method called "CompareTo"
		//Note:-if we want store one object in TreeSet then class should be sub class of Comparable(I)....
		//because it carry its implemenation logic..and override compareTo() method...
		//This ,method returns -ve when a<b          +ve when a>b               0 when a==b
		TreeSet<A> ts5 = new TreeSet<A>();
		ts5.add(new A(2,7));
		ts5.add(new A(4,9));
		ts5.add(new A(3,3));
		System.out.println(ts5);
		
	}
}
