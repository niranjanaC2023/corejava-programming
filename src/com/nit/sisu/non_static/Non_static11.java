package com.nit.sisu.non_static;
class Non_static11
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println("m1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("in main method");
		Non_static11 obj = new Non_static11();
		obj.m1(); 
	}
}
