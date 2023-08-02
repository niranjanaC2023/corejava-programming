package com.nit.sisu.exh;
class Try_catch_Finally4
{
	public static void main(String[] args) 
	{															//finally without exception
		try
		{
			System.out.println("in try");
		}
		finally
		{
		
			System.out.println("in finally");
		}
		System.out.println("after try/finally");
	}
}
