package com.nit.sisu.exh;
class FinallyWithBreakContinue
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
				return 10;
			}
		
			finally	
			{
				break;
			}
		}
		return 20;
	}
}