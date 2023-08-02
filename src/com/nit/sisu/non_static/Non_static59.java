package com.nit.sisu.non_static;
class Non_static59
{
	static
	{
		System.out.println("SB");
		Non_static59 obj = new Non_static59();
	}
	Non_static59()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		Non_static59 obj = new Non_static59();	
	}
	
}



		


