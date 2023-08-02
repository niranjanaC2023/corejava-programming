package com.nit.sisu.exh;
class ValueReturnFromTryCatchReplacedByValueReturnFromFinally2
{
	public static void main(String[] args) 
	{															
		System.out.println(m1());
	}
	static int m1()
	{
		try
		{
			System.out.println("in try");
			return 10/0;
		}													//in try, return as a value not an exception
		catch (ArithmeticException e)
		{
			System.out.println("in catch");
			return 20;
		}	
		finally
		{
			System.out.println("in finally");
			return 30;
		}
	}
}