package com.nit.sisu.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Perfomance4_Retrieve_AllElement_ArrayList_Vector_LinkedList {
	public static void main(String[] args) {
		
	//vector consume more time..becoz it background has synchronize..
	//So..ArrayList is fast ,Compared to vector because ArrayList is not synchronized....
	
	//ArrayList is fast, compared to LinkedList because Arraylist consume less memory
	//LinkedList consume more memory..
	Vector<Object> v = new Vector<>();
	ArrayList<Object> al = new ArrayList<>();
	LinkedList<Object> li = new LinkedList<>();
	for(int i =1;  i<=5000000;  i++)
	{
		v.add(Integer.valueOf(i));
		al.add(Integer.valueOf(i));
		li.add(Integer.valueOf(i));
	}

	long time1, time2 ;
//====vector list=========

	time1 = System.nanoTime();
	for(int i =0;  i<5000000;  i++)
	{
		v.get(Integer.valueOf(i));
	}
	time2 = System.nanoTime();
	System.out.println("v Retrieving all element time : "+(time2-time1));
	
//====Array list=========
		
		time1 = System.nanoTime();
		for(int i=0; i<5000000; i++)
		{
			al.get(Integer.valueOf(i));
		}
		time2 = System.nanoTime();
		System.out.println("al Retrieving all element time : "+(time2-time1));
//====Linked list=========
	
		time1 = System.nanoTime();
		for(int i=0; i<5000000; i++)
		{
			li.get(Integer.valueOf(i));
		}
		time2 = System.nanoTime();
		System.out.println("li Retrieving all element time : "+(time2-time1));
	}
}