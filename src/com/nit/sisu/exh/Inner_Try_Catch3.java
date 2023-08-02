package com.nit.sisu.exh;
class   Inner_Try_Catch3
{
	public static void main(String[] args) 
	{
		
		try
		{	
			System.out.println("in outer try");
			System.out.println(10/0);	
			try																//Exception raised in the outer try,inner try catch & also outer try catch is matched
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
