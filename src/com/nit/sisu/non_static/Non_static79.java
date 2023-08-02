package com.nit.sisu.non_static;
class Example10
{
	
	static
	{
		System.out.println("Example SB---class is loaded");
		Example10 e = new Example10();
		Sample.m1(e);
	}
	Example10()
	{
		System.out.println("Example constructor---object is created");
	}
	void print(String msg)
	{
		System.out.println("msg");
	}
	
}
class Sample
{
	static Example10 e1;
	static void m1(Example10 e)
	{
		e1=e;
	}
	static void m2(String msg)
	{
		e1.print(msg);
	}
}
class Non_static79
{
     	
	static
		{
		System.out.println("Example SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		Class.forName("Example");
		Sample.m2("Niranjana");
	}
}
	



		


