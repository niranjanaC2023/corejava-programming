package com.nit.sisu.non_static;
class Non_static47
{
	int x=m1();
	int m1()
	{
		System.out.println("NSV x");
		return 10;
	}

	{
		System.out.println("NSB1");
	}
	
	Non_static47()
	{
		System.out.println("no-arg constructor");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("main");
		Non_static47 obj2 = new Non_static47();
	
	}
	{
		System.out.println("NSB2");
	}
	int y=m2();
	int m2()
	{
		System.out.println("NSV y");
		return 20;
	}

	
}




		


