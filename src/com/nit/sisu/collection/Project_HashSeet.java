package com.nit.sisu.collection;

import java.util.HashSet;

public class Project_HashSeet {
	public static void main(String[] args) {
			HashSet<Object> hs = new HashSet<>();
			System.out.println(hs.size());
			System.out.println(hs);
			System.out.println();
	//proof:- it store object in hashCode based...
			hs.add("a");
			hs.add(6);
			hs.add("c");
			hs.add(5);
			hs.add("b");
			hs.add(true);
			hs.add(null);
			hs.add(new A(5, 6));
			hs.add(new A(5, 6));		//allow because ..In A.java class there no hashCode is overridden ..So object hashCode is generated based on "reference"...both object hashCode reference is different..so object is stored..
			System.out.println(hs.size());
			System.out.println(hs);
			System.out.println();
			//check duplicate stored or not
			hs.add("a"); //not stored
			hs.add(true); //not allow
			hs.add(null); //not allow
			hs.add(new A(5, 6)); //allow because ..If we don't override hasCode of a class(A.java) but we store that class object in collection then datawise object duplicate object are not stopped...To stop is we must override hashCode() inside equals() method
			A a1 = new A(1,2);
			hs.add(a1);
			hs.add(a1);  //not allowed..If we don't override hasCode of a class(A.java) but we store that class object in collection then reference wise duplicate objects are stopped...becoz of == equal operator..
			System.out.println(hs.size());
			System.out.println(hs);
			System.out.println();
	}
}
