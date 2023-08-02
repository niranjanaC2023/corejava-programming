package com.nit.sisu.exh;
class FinallyWithBreakContinue2
{																//157page
	public static void main(String[] args) 
	{															
		
		System.out.println(m1(5));
	}
	static int m1(int i)
	{
		while(i==5)
		{
			try
			{
				System.out.println("sisu");					//infinite loop
				return 10;
			}
		
			finally	
			{
				continue;
			}
		}
		return 20;
	}
}