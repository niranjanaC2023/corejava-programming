package com.nit.sisu.non_static;
class Example3
{
	static
	{
		System.out.println("Example SV a......variable  is loaded");
	}
	Example3()
	{
		System.out.println("Example constructor.......object is created");
	}
	{
		System.out.println("Example SB ......class is loaded");
	}
}
class Non_static72
{
	
	static
		{
		System.out.println("Non_static71 SB----class is loaded");
		}

	public static void main(String[] args)
	{
		System.out.println("Non_static72 main-----exeution started");
		Example3 e=new Example3();
	}
}
	



		


