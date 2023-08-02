package com.nit.sisu.non_static;
class Example31 
{
	static Example31 e1=new Example31();
	static
	{
		System.out.println("SB start");
	}
	{
		System.out.println("NSB");
	}
	Example31()
	{

		System.out.println("constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
		Example31 e2 = new Example31();

	}
	static int a=10;
	int x=20;
}
