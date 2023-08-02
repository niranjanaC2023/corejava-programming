package com.nit.sisu.non_static;
class Non_static70
{
	static int a=m1();
	static int m1()
	{
		System.out.println("Non_static70 SV a--variable is created");
		return 50;
	}
	static
		{
		System.out.println("Non_static70 SB----class is loaded");
		}

	public static void main(String[] args)
	{
		System.out.println("Non_static70 main-----exeution started");
	}
	static void m2()
	{
		System.out.println("Non_static70 m2");
	}
		
	Non_static70()
	{
		System.out.println("Non_static70 constructor---object is created");
		
	}
	
	
}



		


