package com.nit.sisu.non_static;
class Non_static58
{
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		Non_static58 obj = new Non_static58();	
		System.out.println("object is created");
		System.out.println("end of main");
	}
	int x=m2();
	int m2()
	{
		System.out.println("NSV x");
		System.out.println("end of m2");
		return 10;
	}
	{
		System.out.println("NSB start");
		System.out.println("end of NSB");
	}
	
	Non_static58()
	{
		System.out.println("constructor start");
		Non_static58 obj = new Non_static58();
		System.out.println("constructor end");
	}
	
}



		


