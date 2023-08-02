package com.nit.sisu.non_static;
class Non_static48
{
	int x=m1();
	int m1()
	{
		System.out.println("NSV x");
		return 50;
	}

	{
		System.out.println("NSB1");
	}
	
	Non_static48()
	{
		System.out.println("no-arg constructor");
		x=80;
		y=90;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("main");
		Non_static48 obj = new Non_static48();
	
	}
	{
		System.out.println("NSB2");
	}
	
	int y=m2();
	int m2()
	{
		System.out.println("NSV y");
		return 60;
	}

	
}




		


