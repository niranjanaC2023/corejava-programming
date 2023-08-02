package com.nit.sisu.exh;

class Example2
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
			try
			{
			System.out.println(10/0);
		
			}
			catch(ArithmeticException be)
			{
				System.out.println("5");
			}
			System.out.println("6");
		}			
		System.out.println("7");
	}
}
class Find_Normal_Abnormal_Exception3
{
	public static void main(String[]args)
	{
		Example2 e1=new Example2();
		e1.m1();
	}
}
