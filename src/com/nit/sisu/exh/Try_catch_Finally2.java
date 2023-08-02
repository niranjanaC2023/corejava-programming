package com.nit.sisu.exh;
class Try_catch_Finally2
{
	public static void main(String[] args) 
	{															//try,catch,finally with exception and catch block is matched
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("in catch");
		}
		finally
		{
		
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");
	}
}
