package com.nit.sisu.non_static;
class Non_static29
{
	int x=10;
	int y=20;
	void m1(int a,int b)
	{
		x=a;
		y=b;

	}
	void m2(int X,int Y)
	{
		x=X;
		y=Y;

	}
	void m3(int X,int Y)
	{
		this.x=X;
		this.y=Y;

	}
	public static void main(String[] args) 
	{
		Non_static29 obj1 = new Non_static29 ();
		System.out.println(obj1.x+"...."+obj1.y);
		
		obj1.m1(30,40);
		System.out.println(obj1.x+"...."+obj1.y);
		
		obj1.m2(50,60);
		System.out.println(obj1.x+"...."+obj1.y);
	
		obj1.m3(70,80);
		System.out.println(obj1.x+"...."+obj1.y);


	}
}




		


