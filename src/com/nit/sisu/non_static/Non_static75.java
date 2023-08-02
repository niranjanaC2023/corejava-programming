package com.nit.sisu.non_static;
class Example6
{

	static
	{
		System.out.println("Example SV a......variable  is loaded");
	}
	static
	{
		System.out.println("Example SB ......class is loaded");
	}
	Example6()
	{
		System.out.println("Example constructor .....class object ");
	}
}
class Non_static75
{
	
	static
		{
		System.out.println("Non_static75 SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Non_static75 main-----exeution started");
		Example6 e = new Example6();
		Class.forName("Example");
		
	}
}
	



		


