package com.nit.sisu.non_static;
class Non_static56
{
	Non_static56()
	{
		System.out.println("constructor");
		Non_static56 obj = new Non_static56();	
	}
	
	
	public static void main(String[] args)			//overflow
	{
		System.out.println("main");
		Non_static56 obj = new Non_static56();	
		
	}
	
}



		


