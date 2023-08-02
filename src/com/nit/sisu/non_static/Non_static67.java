package com.nit.sisu.non_static;
class Non_static67
{
	int x=5,y=10;
	public static Non_static67 obj = new Non_static67();
	{
		System.out.println("initializer block is called....");
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	public static void main(String[] args)			//overflow
	{

	}
	
}



		


