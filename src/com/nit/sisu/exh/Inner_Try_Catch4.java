package com.nit.sisu.exh;
class   Inner_Try_Catch4
{
	public static void main(String[] args) 
	{
		
		try
		{	
			System.out.println("in outer try");	
			try																//Exception raised in the inner try,inner try catch & also inner try catch is matched
			{
				System.out.println("in inner try");
				System.out.println(10/0);
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
