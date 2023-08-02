package com.nit.sisu.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Perfomance_Adding_ArrayList_Vector_LinkedList {
	public static void main(String[] args) {
		
	//vector consume more time..becoz it background has synchronize..
	//So..ArrayList is fast ,Compared to vector because ArrayList is not synchronized....
	
	//ArrayList is fast, compared to LinkedList because Arraylist consume less memory
	//LinkedList consume more memory..
	Vector<Object> v = new Vector<>();
	ArrayList<Object> al = new ArrayList<>();
	LinkedList<Object> li = new LinkedList<>();
	
//====vector list=========
	long time1, time2 ;
	time1 = System.nanoTime();
	for(int i =1;  i<=5000000;  i++)
	{
		v.add(Integer.valueOf(i));
	}
	time2 = System.nanoTime();
	System.out.println("v adding time : "+(time2-time1));
	
//====Array list=========
		
		time1 = System.nanoTime();
		for(int i=1; i<=5000000; i++)
		{
			v.add(Integer.valueOf(i));
		}
		time2 = System.nanoTime();
		System.out.println("al adding time : "+(time2-time1));
//====Linked list=========
	
		time1 = System.nanoTime();
		for(int i=1; i<=5000000; i++)
		{
			v.add(Integer.valueOf(i));
		}
		time2 = System.nanoTime();
		System.out.println("li adding time : "+(time2-time1));
	}
}