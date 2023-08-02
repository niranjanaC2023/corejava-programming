package com.nit.sisu.collection;
import java.util.HashMap;
//Memory diagram and storing Algorithm..
/*
 * 1. HashMap internally uses hash table data structure for storing object...
 * 2. Using "put" method, if we want to store duplicate "key" then it will allow that key and replace that key's value..
 * How it allow duplicate key internally...How to stop it ?
 * 
 */
public class HashMapInternal {
	public static void main(String[] args) {
		HashMap<Object,Object> hm = new HashMap<>(); //Due to Concept of "inference"...we don't use rightSide arguments..
		System.out.println(hm);
		
		hm.put(new A(5,6), 1);
		hm.put(new A(5,6), 2);
		System.out.println(hm);
	}
}
