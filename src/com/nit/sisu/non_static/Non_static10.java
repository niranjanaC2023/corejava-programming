package com.nit.sisu.non_static;
class Non_static10
{
	void m1()
	{
		System.out.println("m1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("in main method");
		Non_static10 obj = new Non_static10();
		obj.m1(); 
	}
}
