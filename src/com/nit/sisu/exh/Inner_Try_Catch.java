package com.nit.sisu.exh;
class   Inner_Try_Catch 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("in outer try");		
			try																//No Exception raised in the program
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
