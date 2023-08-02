package com.nit.sisu.non_static;
class Example4
{

	static
	{
		System.out.println("Example SV a......variable  is loaded");
	}
	static
	{
		System.out.println("Example SB ......class is loaded");
	}
}
class Non_static73
{
	
	static
		{
		System.out.println("Non_static73 SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Non_static73 main-----exeution started");
		Class.forName("Example");
	}	
}
	



		


