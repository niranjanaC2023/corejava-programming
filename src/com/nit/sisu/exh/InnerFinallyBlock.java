package com.nit.sisu.exh;
class InnerFinallyBlock
{	
	public static void main(String[]args)
	{
															//160page															
		m1();												//No exception raised in outer try or inner try block
	}
		static void m1()
		{
			try
			{
					System.out.println("in outer try");	
					try
					{
						System.out.println("in inner try");					
						
					}
					catch(NullPointerException e)
					{
						System.out.println("in inner catch");

					}
					finally
					{
						System.out.println("in inner finally");
					}
					System.out.println("after inner try/catch/finally");
			}
			catch(NullPointerException e)
			{
				System.out.println("in outer catch");
			}
			finally
			{
				System.out.println("in outer finally");
			}
			System.out.println("Afterouter try/catch/finally");	
	}
}
			
		