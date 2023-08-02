package com.nit.sisu.Methods;
class Modify_data2
{
	public static void main(String[] args) 
	{
		Bike e1 = new Bike();
		Bike e2 = new Bike();

		System.out.println("x:"+e1.x);
		System.out.println("y:"+e1.y);

		System.out.println("insert data in example1");
		e1.x=10;
		e1.y=20;
		System.out.println("x:"+e1.x);
		System.out.println("y:"+e1.y);
		
		System.out.println();
		System.out.println("modify data in example1");
		e1.x=30;
		e1.y=40;
		System.out.println("x:"+e1.x);
		System.out.println("y:"+e1.y);

		System.out.println();
		System.out.println("insert data in example2");
		e2.x=15;
		e2.y=16;
		System.out.println("x:"+e2.x);
		System.out.println("y:"+e2.y);

		System.out.println();
		System.out.println("modify data in example2");
		e2.x=18;
		e2.y=19;
		System.out.println("x:"+e2.x);
		System.out.println("y:"+e2.y);

	}
}
class Bike
{
	int x;
	int y;
}
