package com.nit.sisu.non_static;
class Non_static63
{
	static 
	{
		System.out.println("SB start");
		Non_static63 obj = new Non_static63();
		System.out.println("SB end");
	}
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}
	Non_static63()
	{
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		System.out.println("main end");
	}
	
}



		


