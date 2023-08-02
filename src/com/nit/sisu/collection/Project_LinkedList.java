package com.nit.sisu.collection;

import java.util.LinkedList;

public class Project_LinkedList {
	public static void main(String[] args) {
			LinkedList<Object> li = new LinkedList<>();
			System.out.println("li size: "+li.size());
			System.out.println("li elements are: "+li);
			System.out.println();
			
			li.add("a");
			li.add("b");
			li.add(5);
			li.add("a");
			li.add(5);
			li.add(null);
			li.add(null);
			li.add(new A(5,6));
			li.add(new A(5,6));
			System.out.println("li size: "+li.size());
			System.out.println("li elements are: "+li);
			System.out.println();
									
	}
}
