package com.nit.sisu.exh;

class Example
{	
	void m1()
	{
		System.out.println("1");
		try
		{
				System.out.println("2");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("4");
			System.out.println(10/0);
			System.out.println("5");
		}
		System.out.println("6");
			
	}	
}
class Find_Normal_Abnormal_Exception1
{
	public static void main(String[]args)
	{
		Example e1=new Example();
		e1.m1();
	}
}
