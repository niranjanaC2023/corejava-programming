package com.nit.sisu.exh;
class SuppressUsingReturn
{
	public static void main(String[] args) 
	{
		m1();
		System.out.println(10/0);
	}
	static void m1()
	{
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch (NullPointerException e)
		{
			System.out.println("in catch");
		
		}
		finally{
				System.out.println("in finally");
		
				return;
		}
		
	}
	
}
