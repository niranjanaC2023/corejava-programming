package com.nit.sisu.non_static;
class Non_static60
{
	{
		System.out.println("NSB");
		Non_static60 obj = new Non_static60();
	}
	Non_static60()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main");
		Non_static60 obj = new Non_static60();	
	}
	
}



		


