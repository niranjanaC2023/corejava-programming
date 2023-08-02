package com.nit.sisu.non_static;
class Non_static62
{
	 Non_static62 obj = new Non_static62();
	Non_static62()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main");
		Non_static62 obj = new Non_static62();	
	}
	
}



		


