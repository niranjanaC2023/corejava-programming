package com.nit.sisu.non_static;
class Example2
{
	
	static
		{
		System.out.println("Example SV....variable is ceated");
		}
	static void m1()
	{
		System.out.println("Example m1 ");
	}
	static
		{
		System.out.println("Example SB----class is loaded");
		}


}
class Non_static71
{
	
	
	static
		{
		System.out.println("Non_static71 SB----class is loaded");
		}
	public static void main(String[] args)
	{
		System.out.println("Non_static71 main-----exeution started");
		Example2.m1();
	}
	
}
	



		


