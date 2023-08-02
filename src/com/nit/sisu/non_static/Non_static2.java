package com.nit.sisu.non_static;
class Non_static2 
{
	int x=10;
	int y=20;
	public static void main(String[] args) 
	{
		Non_static2 obj1 = new Non_static2();
		Non_static2 obj2 = new Non_static2();
		System.out.println("x:"+obj1.x);
		System.out.println("y:"+obj2.y);
	}
}
