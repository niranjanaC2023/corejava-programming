package com.nit.sisu.non_static;
class Non_static3
{
	int x=50;
	int y=60;
	public static void main(String[] args) 
	{
		Non_static3 obj1 = new Non_static3();
		Non_static3 obj2 = new Non_static3();
		System.out.println("x:"+obj1.x);
		System.out.println("y:"+obj1.y);
		obj2.x=80;
		obj2.y=90;
		System.out.println("x:"+obj2.x);
		System.out.println("y:"+obj2.y);

	}
}
