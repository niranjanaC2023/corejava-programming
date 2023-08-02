package com.nit.sisu.non_static;
class Non_static34
{
	
	Non_static34()
	{
		System.out.println("constructor");
	}
	void Non_static34()
	{
		System.out.println("in method");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
		Non_static34 obj1 = new Non_static34();
		obj1.Non_static34();		
	
	}
	
	
}




		


