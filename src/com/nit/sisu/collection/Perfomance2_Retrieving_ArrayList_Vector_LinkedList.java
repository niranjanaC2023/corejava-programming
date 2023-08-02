package com.nit.sisu.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Perfomance2_Retrieving_ArrayList_Vector_LinkedList {
	public static void main(String[] args) {
		
	//vector consume more time..becoz it background has synchronize..
	//So..ArrayList is fast ,Compared to vector because ArrayList is not synchronized....
	
	//ArrayList is fast, compared to LinkedList because Arraylist consume less memory
	//LinkedList consume more memory..
	Vector<Object> v = new Vector<>();
	ArrayList<Object> al = new ArrayList<>();
	LinkedList<Object> li = new LinkedList<>();
//*******************retrieving 1st object*****************
	
//====vector list=========
	
	for(int i =1;  i<=1000000;  i++)
	{
		v.add(Integer.valueOf(i));
		al.add(Integer.valueOf(i));
		li.add(Integer.valueOf(i));
	}
	long time1, time2 ;
//====Vector list=========
	time1 = System.nanoTime();
	v.get(Integer.valueOf(1));
	time2 = System.nanoTime();
	System.out.println("v 1st object retrieving time : "+(time2-time1));
	
//====Array list=========
		
		time1 = System.nanoTime();
		al.get(Integer.valueOf(1));
		time2 = System.nanoTime();
		System.out.println("al 1st object retrieving time : "+(time2-time1));
//====Linked list=========
	
		time1 = System.nanoTime();
		li.get(Integer.valueOf(1));
		time2 = System.nanoTime();
		System.out.println("li 1st object retrieving time : "+(time2-time1));
	}
}