package com.nit.sisu.exh;
class ValueReturnFromTryCatchNotMatchReplacedByValueReturnFromFinally
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
		}													//in try, return as a value as an exception
		catch (NullPointerException e)
		{
			System.out.println("in catch");
		}	
		finally
		{
			System.out.println("in finally");
			return 30;
		}
	}
}