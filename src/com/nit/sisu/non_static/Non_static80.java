package com.nit.sisu.non_static;

class Example11
{
	static Example11 e1;
	static void m1(Example11 e)
	{
		e1=e;
	}
	static void m2(String msg)
	{
		e1.m2(msg);
	}
}
class Non_static80
{
     	
	static
		{
		System.out.println("Example SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		Class.forName("Example");
		Example11.m2("Niranjana");
	}
}
	



		


