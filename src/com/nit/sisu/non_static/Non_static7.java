package com.nit.sisu.non_static;
class Non_static7
{
	static int a=10;
	static int b=20;

	int x=30;
	int y=40;

	
	public static void main(String[] args) 
	{
		
		Non_static7 obj1 = new Non_static7();
		Non_static7 obj2 = new Non_static7();
		Non_static7 obj3 = null;
		obj1.a=50;
		obj1.b=60;

		obj1.x=70;
		obj1.y=80;
	}
}
