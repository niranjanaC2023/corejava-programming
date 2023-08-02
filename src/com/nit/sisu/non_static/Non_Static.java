package com.nit.sisu.non_static;
class Non_Static 
{
	static Non_Static  e1=new Non_Static();
	static
	{
		System.out.println("SB start");
	}
	{
		System.out.println("NSB");
	}
	Non_Static()
	{

		System.out.println("constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
		Non_Static  e2 = new Non_Static();

	}
	static int a=10;
	int x=20;
}
