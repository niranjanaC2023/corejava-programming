package com.nit.sisu.exh;
class FinallyWithBreakContinue6
{	
	public static void main(String[]args)
	{
															//159page															
		System.out.println(m1(5));
	}
		static int m1(int i)
		{
			
			while(i==5)
			{
				
				try
				{
					
					try
					{
						i=10;
						System.out.println("in try"+i);					
						
					}
					finally
					{
						i=20;
						System.out.println("in finally"+i);
						
					}
					i=30;
					return i;
				}
				finally
				{
					if(i==30)
					{
						break;
					}
				}
		}
		return 40;
	}
}
			
		