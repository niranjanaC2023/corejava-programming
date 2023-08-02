package com.nit.sisu.non_static;
class Example8
{
	
	static
	{
		System.out.println("Example SB---class is loaded");
		//Example e = new Example();
	}
	Example8()
	{
		System.out.println("Example constructor---object is created");
	}
	
}
class Non_static78
{
     	
	static
		{
		System.out.println("Non_static78 SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Non_static78 main-----exeution started");
		Class.forName("Example");
		Example8 e = new Example8();
	}
}
	



		


