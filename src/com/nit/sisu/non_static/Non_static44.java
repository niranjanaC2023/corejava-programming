package com.nit.sisu.non_static;
class Non_static44
{
	

	Non_static44()
	{
		System.out.println("no-arg constructor");
	}
	Non_static44(int X)
	{
		System.out.println("int-arg constructor");
	}
	Non_static44(String X)
	{
		System.out.println("string-arg constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
		Non_static44 obj1 = new Non_static44();
		Non_static44 obj2 = new Non_static44(5);
		Non_static44 obj3 = new Non_static44("abc");
	}
	
	
}




		


