package com.nit.sisu.exh;
class LocalVariableWithTry
{
	public static void main(String[] args)			//169pg
	{
		int a=-1;
		try
		{
			a=10;
			System.out.println("in catch a:"+a);
		}
		catch (ArithmeticException e)
		{
			a=20;
			System.out.println("in catch:"+a);
		}
		finally
		{
			System.out.println("in finally a:"+a);
		}
		System.out.println("after try/catch/finally:"+a);
	}
	

}
