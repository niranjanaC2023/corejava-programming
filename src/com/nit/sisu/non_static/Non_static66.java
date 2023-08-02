package com.nit.sisu.non_static;
class Non_static66
{
	Non_static66 obj = new Non_static66();
	static
	{
		System.out.println("SB start");
		System.out.println("SB end");
	}
	int x=m1();
	int m1()
	{
		System.out.println("NSV x");
		System.out.println("end of m1");
		return 10;
	}
	{
		System.out.println("NSB start");
		System.out.println("end of NSB");
	}
	Non_static66()
	{
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		Non_static66 obj = new Non_static66();
		System.out.println("main end");
	}
	
}



		


