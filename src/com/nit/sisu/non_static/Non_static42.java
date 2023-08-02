package com.nit.sisu.non_static;
class Non_static42
{
	int x=10,y=20;

	Non_static42()
	{
		x=50;
		y=60;
	}
	
	public static void main(String[] args)
	{
	System.out.println("main");	
	Non_static42 obj1 = new Non_static42();
	Non_static42 obj2 = new Non_static42();
	}
	
	
}




		


