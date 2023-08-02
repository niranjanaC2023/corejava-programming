package com.nit.sisu.non_static;
class Non_static57
{
	void m1()
	{
		System.out.println("m1 start");
		m1();
		System.out.println("m1 end");
	}
	
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		Non_static57 obj = new Non_static57();	
		obj.m1();
		System.out.println("main end");	
	}
	
	int x=m2();
	int m2()
	{
		System.out.println("NSV x");
		return 50;
	}
	Non_static57()
	{
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	
}



		


