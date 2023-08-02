package com.nit.sisu.non_static;
class Example9
{
	static
	{
		System.out.println("Example SB---class is loaded");
	}

	static int a=m2();
	static int m2()
	{
		
		System.out.println("Example SV---variable is loaded");
		return 50;
	}
	
}
class Non_static77
{
     	
	static
		{
		System.out.println("Non_static76 SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Non_static76 main-----exeution started");
		System.out.println("before null referenced variable creation");
		Example9 e = null;
		System.out.println("after null referenced variable creation");
		System.out.println("before m2() method is called");
		e.m2();
		System.out.println("after m2() method is called");
	}
}
	



		


