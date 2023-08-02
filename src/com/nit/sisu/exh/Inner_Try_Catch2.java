package com.nit.sisu.exh;
class   Inner_Try_Catch2
{
	public static void main(String[] args) 
	{
		System.out.println(10/0);
		try
		{
			System.out.println("in outer try");		
			try																//Exception raised in the method before outer try
			{
				System.out.println("in inner try");
			}
			catch (ArithmeticException ae)
			{
				System.out.println("in inner catch");
			}
			System.out.println("After inner try/catch");
		}
		catch(ArithmeticException nas)
		{
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");
	}
}
