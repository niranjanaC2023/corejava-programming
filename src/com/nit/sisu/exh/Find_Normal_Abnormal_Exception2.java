package com.nit.sisu.exh;

class Example1
{	
	void m1()
	{
		System.out.println("1");
		try
		{
				System.out.println("2");
				System.out.println(10/0);
				System.out.println("3");
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
class Find_Normal_Abnormal_Exception2
{
	public static void main(String[]args)
	{
		Example1 e1=new Example1();
		e1.m1();
	}
}
