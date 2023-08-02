package com.nit.sisu.collection;

import java.util.LinkedHashSet;

public class Project_LinkedHashSeet {
	public static void main(String[] args) {
			LinkedHashSet<Object> lhs = new LinkedHashSet<>();
			System.out.println(lhs.size());
			System.out.println(lhs);
			System.out.println();
	//proof:- it store object in hashCode based...
			lhs.add("a");
			lhs.add(6);
			lhs.add("c");
			lhs.add(5);
			lhs.add("a");
			lhs.add(true);
			lhs.add(null);
			lhs.add(new A(5, 6));
			lhs.add(new A(5, 6));		//allow because ..In A.java class there no hashCode is overridden ..So object hashCode is generated based on "reference"...both object hashCode reference is different..so object is stored..
			System.out.println(lhs.size());
			System.out.println(lhs);
			System.out.println();
			//check duplicate stored or not
			lhs.add("a"); //not stored
			lhs.add(true); //not allow
			lhs.add(null); //not allow
			lhs.add(new A(5, 6)); //allow because ..If we don't override hasCode of a class(A.java) but we store that class object in collection then datawise object duplicate object are not stopped...To stop is we must override hashCode() inside equals() method
			A a1 = new A(1,2);
			lhs.add(a1);
			lhs.add(a1);  //not allowed..If we don't override hasCode of a class(A.java) but we store that class object in collection then reference wise duplicate objects are stopped...becoz of == equal operator..
			System.out.println(lhs.size());
			System.out.println(lhs);
			System.out.println();
	}
}
