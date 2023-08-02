package com.nit.sisu.exh;
class Try_FinallyWithSystemExitZero
{
	public static void main(String[] args) 
	{															

				try
				{
					System.out.println("in try");
					System.exit(0);
				}									
				finally
				{
				
					System.out.println("in finally");
				}
			System.out.println("after try/finally");		
			
	}
}
