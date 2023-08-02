package com.nit.sisu.exh;
class TryFinallyWithReturn
{
	public static void main(String[] args) 
	{															
			try
			{
				System.out.println("in try");
				return;
			}											//return  used for exception
			finally
			{
			
				System.out.println("in finally");
			}
			//System.out.println("after try/finally");		//unreachable statement
	}
}
