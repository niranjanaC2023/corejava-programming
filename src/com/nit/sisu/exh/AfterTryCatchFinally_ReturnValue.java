package com.nit.sisu.exh;
class AfterTryCatchFinally_ReturnValue
{																//find this program is normal and abnormal
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
		}													
		catch (NullPointerException e)
		{
			System.out.println("in catch");
		}	
		finally
		{
			System.out.println("in finally");
		}
		return 30;
	}
}