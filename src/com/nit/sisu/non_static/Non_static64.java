package com.nit.sisu.non_static;
class Non_static64
{
	int x=m1();
	int m1()
	{
		System.out.println("NSV x");
		System.out.println("end of m1");
		return 10;
	}
	{
		System.out.println("NSB start");
		Non_static64 obj = new Non_static64();
		System.out.println("end of NSB");
	}
	Non_static64()
	{
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		Non_static64 obj = new Non_static64();
		System.out.println("main end");
	}
	
}



		


