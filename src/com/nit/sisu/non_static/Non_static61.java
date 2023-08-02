package com.nit.sisu.non_static;
class Non_static61
{
	static Non_static61 obj = new Non_static61();
	Non_static61()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main");
		Non_static61 obj = new Non_static61();	
	}
	
}



		


