package com.nit.sisu.non_static;
class Non_static9
{
	void m1()
	{
		System.out.println("in m1 method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("in main method");
		Non_static9 obj = new Non_static9();
		obj.m1();
	}
}
