package com.nit.sisu.exh;
class NegativeArraySizeExce
{																//155page
	public static void main(String[] args) 
	{															
		m1();
		System.out.println("after m1 calling");
	}
	static void m1()
	{
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}													
		catch (NullPointerException e)
		{
			System.out.println("in catch");
		}	
		finally
		{
			System.out.println("in finally");
			int[] ia = new int[-5];								//NegativeArraaySizeException
		}
		
	}
}