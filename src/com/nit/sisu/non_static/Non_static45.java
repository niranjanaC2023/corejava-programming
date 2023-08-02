package com.nit.sisu.non_static;
class Non_static45
{
	

	{
		System.out.println("NSB");
	}
	
	Non_static45()
	{
		System.out.println("no-arg constructor");
	}
	
	Non_static45(String X)
	{
		System.out.println("string-arg constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
		Non_static45 obj2 = new Non_static45();
		Non_static45 obj3 = new Non_static45("abc");
	}
	
	
}




		


