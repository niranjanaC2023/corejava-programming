package com.nit.sisu.exh;
class Checkes_UncheckesException_Rules
{

	void m1() throws InterruptedException
	{
		throw new InterruptedException();
	}
	

	/*void m2()
	{
		try
		{
			
		}
		catch (InterruptedException e)
		{
		}
	}*/

	void m2()
	{
		try
		{
			throw new InterruptedException();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}

	void m3() throws InterruptedException
	{
		try
		{
			throw new InterruptedException();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}

	void m4() throws InterruptedException
	{
	}

	void m5()
	{
		try
		{
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	}

	void m6()
	{
		try
		{
		}
		catch (Exception e)
		{
			
		}
	}
	
	void m7()
	{
		//throw new Exception();
	}

	void m8() throws Exception 
	{
		throw new Exception();
	}

	public static void main(String[]args)
	{
	}
	
}
