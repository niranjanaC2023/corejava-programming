package com.nit.sisu.non_static;
class Example1
{
	static 
	{
		System.out.println("example class is loaded");
	}
	static void m1()
	{
		System.out.println("example m1");
	}
}
class Non_static69
{
	static
	{
		System.out.println("Non_static69 class is loaded");
	}
	public static void main(String[] args)
	{
		System.out.println("main start");
		
		Example1.m1();

		System.out.println("main end");
		
	}
	
	
}



		


