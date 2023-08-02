package com.nit.sisu.exh;
class Try_FinallyWithReturnWithValue
{
			public static void main(String[] args) 
			{															
				System.out.println(m1());
			}
			static int m1()
			{

				try
				{
					System.out.println("in try");
					return 10;
				}											//return  used for exception
				finally
				{
				
					System.out.println("in finally");
				}
				//System.out.println("after try/finally");		
				//return 20;
			}
}
