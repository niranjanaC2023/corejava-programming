package com.nit.sisu.non_static;
class Non_static55
{
	static void m1()
	{
		System.out.println("m1");
		m1();	
	}
	
	
	public static void main(String[] args)			//overflow
	{
		System.out.println("main");
		m1();
	}
	
}



		


