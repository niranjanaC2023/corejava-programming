package com.nit.sisu.exh;
class InnerFinallyBlock3
{	
	public static void main(String[]args)
	{
															//162page															
		System.out.println(m1());												//return stmt placed in outer finally
	}
		static int m1()
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
						return 10;
					}
					//System.out.println("after inner try/catch/finally");
			}
			catch(NullPointerException e)
			{
				System.out.println("in outer catch");
			}
			finally
			{
				System.out.println("in outer finally");
				return 30;	
			}
			
			//System.out.println("Afterouter try/catch/finally");
			
	}
}
			
		