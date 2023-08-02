package com.nit.sisu.exh;
class StatementAfterEndOfMethodWhenReturnUsedFinally
{																//156page
	public static void main(String[] args) 
	{															
		
		System.out.println(m1());
	}
	static int m1()
	{
		try
		{
			System.out.println("in try");
			return 10;
		}													
		catch (ArithmeticException e)
		{
			System.out.println("in catch");
		}	
		finally
		{
			System.out.println("in finally");
			if(true)
			{
			return 30;
			}								
		}
		System.out.println("after try/catch/finally");
		return 40;
		
	}
}