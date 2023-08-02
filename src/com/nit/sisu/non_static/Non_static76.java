package com.nit.sisu.non_static;
/*class Example
{
	static
	{
		System.out.println("Non_static77 SB---class is loaded");
	}
}*/
class Non_static76
{
     	
	static
		{
		System.out.println("Non_static76 SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Non_static76 main-----exeution started");
		//System.out.println("before null referenced variable creation");
		Example e = null;
		/*System.out.println("after null referenced variable creation");
		System.out.println("before m2() method is called");
		e.m2();
		System.out.println("after m() method is called");*/
	}
}
	



		


