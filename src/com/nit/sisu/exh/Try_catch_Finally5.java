package com.nit.sisu.exh;
class Try_catch_Finally5
{
	public static void main(String[] args) 
	{															//try/finally with exception
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}
		finally
		{
		
			System.out.println("in finally");
		}
		System.out.println("after try/finally");
	}
}
