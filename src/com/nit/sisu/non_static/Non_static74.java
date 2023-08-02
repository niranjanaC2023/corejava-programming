package com.nit.sisu.non_static;
class Example5
{

	static
	{
		System.out.println("Example SV a......variable  is loaded");
	}
	static
	{
		System.out.println("Example SB ......class is loaded");
	}
	Example5()
	{
		System.out.println("Example constructor .....class object ");
	}
}
class Non_static74
{
	
	static
		{
		System.out.println("Non_static74 SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Non_static74 main-----exeution started");
		Class.forName("Example");
		Example5 e = new Example5();
	}
}
	



		


