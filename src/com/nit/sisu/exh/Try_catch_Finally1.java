package com.nit.sisu.exh;
class Try_catch_Finally1 
{
	public static void main(String[] args) 
	{															//try,catch,finally without exception [try block is completed normally
		try
		{
			System.out.println("in try");
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
